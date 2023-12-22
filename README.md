# tea-shop
## Database API 使用方法

透過 HTTP 請求方法（GET、PUT、DELETE、POST）來使用 API。


### 步驟：

1. 首先，前往 GitHub 下載 Postman 示例的 JSON 檔案。
2. 使用 Google Chrome 瀏覽器開啟 [Postman 網站](https://www.postman.com/)。
3. 在 Postman 中導入剛剛下載的 JSON 檔案。
4. 導入後，您將看到一個包含 API 使用方法示範的表格。


### 註：

- 確保您已安裝 Postman 應用程式或擴充功能。

---

## 後端編寫方法
### 使用spring boot 和 thymeleaf框架
1. spring boot是一個框架，在Controller中處理用戶的請求。
2. 在com.example.EBDEMO.controller這個pacage中新增class，然後`iimport org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;`，並且在class前加上`@Controller`，可以參考這個package中的其它controller。
3. thymeleaf 是模板引擎，用來做出視圖(view)，這樣可以不用JSP


