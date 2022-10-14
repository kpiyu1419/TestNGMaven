
# Health Graph QA Automation

Health Graph is application which is provided  thru AltoroMutual site.
It Provides operations like fund transfer, account summary and so on.
## Acknowledgements

 http://testfire.net/index.jsp
 https://github.com/matiassingers/awesome-readme)
 https://bulldogjob.com/news/449-how-to-write-a-good-readme-for-your-github-project)


## API Reference

#### Get all items

```http
  GET /api/items
```

| Parameter | Type     | Description                |
| :-------- | :------- | :------------------------- |
| `api_key` | `string` | **Required**. Your API key |

#### Get item

```http
  GET /api/items/${id}
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `id`      | `string` | **Required**. Id of item to fetch |

#### add(num1, num2)

Takes two numbers and returns the sum.


## Appendix

Any additional information goes here


## Badges

Add badges from somewhere like: [shields.io](https://shields.io/)

[![MIT License](https://img.shields.io/badge/License-MIT-green.svg)](https://choosealicense.com/licenses/mit/)
[![GPLv3 License](https://img.shields.io/badge/License-GPL%20v3-yellow.svg)](https://opensource.org/licenses/)
[![AGPL License](https://img.shields.io/badge/license-AGPL-blue.svg)](http://www.gnu.org/licenses/agpl-3.0)


## Environment Variables

To run this project, you will need to add java environment variables to your to set

`API_KEY`

`ANOTHER_API_KEY`


## Installation

Install my-project with npm

Eclipse, Maven, TestNG Installation rewuired.
POM file with depencies of Selenium java,TestNG, WebDriver manager reuired
```
    