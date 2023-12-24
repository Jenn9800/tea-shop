# tea-shop

## 開始
1. 先將github clone下來
2. 打開eclipse，按最上面的幫助，然後按Eclipse Marketplace，接著搜尋Spring，安裝Spring Tool 4(aka Spring Tool Suite 4)。
3. 用eclipse打開EBDEMO，然後可能要等它安裝套件（最右下角會顯示進度條）。
4. 在src/main/java/com.example.EBDEMO中的是主程式，要run as spring boot app
5. 有時候寫完code可能沒反應，這時要stop server，然後對著EBDEMO按右鍵，Maven -> Update project。


## Database API 使用方法

透過 HTTP 請求方法（GET、PUT、DELETE、POST）來使用 API。


### 步驟：

1. 首先，前往 GitHub 下載 Postman 示例的 JSON 檔案。
2. 使用 Google Chrome 瀏覽器開啟 [Postman 網站](https://www.postman.com/)。
3. 在 Postman 中導入剛剛下載的 JSON 檔案。
4. 導入後，您將看到一個包含 API 使用方法示範的表格。


### http request方法
- 把TABLE換成你要的表格名字
- 把id換成你要的id
- 括號中的是request method
1. 查詢某表格的所有資料: (GET) http://localhost:8080/TABLE/all 
2. 查詣某表格的某特定資料: (GET) http://localhost:8080/TABLE/get/id
3. 更新某表格的資料: (PUT) http://localhost:8080/TABLE/update/id
4. 删除某資料: (DELETE) http://localhost:8080/TABLE/delete/id
5. 新增資料: (POST) http://localhost:8080/TABLE/add


### 註：

- 確保您已安裝 Postman 應用程式或擴充功能。



## 後端編寫方法
### spring boot 和 thymeleaf
1. spring boot是一個框架，在Controller中處理用戶的請求。
2. 在com.example.EBDEMO.controller這個pacage中新增class，然後`import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;`，並且在class前加上`@Controller`，可以參考這個package中的其它controller。
3. thymeleaf 是模板引擎，用來做出視圖(view)，這樣可以不用JSP


