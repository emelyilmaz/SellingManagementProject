# SellingManagementProject

 Java Desktop Selling Management Project

- This project enables a company with different product stocks in different categories to easily sell to its customers. It does not only include the payment part, that's why  the customer's current account is not kept but information about which customer bought products from which category and when is is easily accessible.

- In the login form, defined users log in with their passwords. User passwords are encrypted with the MD5 algorithm. A form has been designed for the user who forgot the password.When the forgot password button is pressed, the e-mail address is checked and a new form is opened if it is correct. At the same time, the verification code is sent to the user's e-mail address. The validity period of the verification code is set to 1 hour.When the code is sent and the code is saved in the database. In this way, the necessary comparison is made.


- The main form opens for the user who has logged in with the correct e-mail address and password. The user can add, delete, edit customers on the first page.The requirement that the added customer's e-mail address or phone be unique has also been checked. A warning message is returned to the user. If any sale has been made to the selected customer, the customer is not allowed to be deleted.


- On the category page, the user can perform category-related crud functions.Again, at this stage, if the selected category is included in a completed sale, the category is not allowed to be deleted.


- In the same way, on the product page, the user can perform the necessary crud functions related to the product.Data type validation has been done in data entries(  such as whether the entered stockquantitity is a number).Additionally, the deletion of the product assigned a sale(not basket) is not allowed.


- In the sales management page, the user is enabled to select the customer first. As soon as the customer is selected, the category checkbox becomes active.
 When the category is selected, the products belonging to that category are selected from the product table.The number of spinner components that will be sold from   that selected product is modeled according to the stock amount of the selected product.The count is selected and then the product is listed in the basket table by  clicking the add to cart button.This is repeated for different categories and different products.If desired, the product can be deleted from the basket.When the  process of adding to the basket and removing from the basket is completed, the complete sale button is pressed and the sale is completed. The tables are cleaned and become ready for the new customer.


- If the cancel button is pressed before the sale is completed, all selections and tables are cleared.If there is any product left in the selected customer's basket, when a new product is added to that customer, it appears in the previously added products in the basket table.


- On the report page, the sales data of the desired date according to the desired parameter can be accessed. The model of the table is connected to the relevant searc textbox. Therefore, when the parameter and date are changed, it is necessary to make a keyboard movement in the textbox.By pressing the pdf button, the table on the screen is converted to a pdf file. There is general profit and loss information in the lower left corner. This information is updated with each new sale.

- On the user settings page, User can change existing password.
<b>
</b>



## Languages, Technologies and Environments Used in this Project


| Java/JFrame  | OOP | SQLite | IntelliJ  |
| :------------: | :------------: | :------------: | :------------: |
|  <img src ="https://cdn.iconscout.com/icon/free/png-256/java-60-1174953.png" width ="100px" height = "100px" style="float:left" > | <img src ="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRQie1pvA8p-kyK_bGjsjPJWv8x4NF9ahNvFA&usqp=CAU" width ="65px" height = "65px" style="float:left " >  |  <img src ="https://upload.wikimedia.org/wikipedia/commons/thumb/9/97/Sqlite-square-icon.svg/1200px-Sqlite-square-icon.svg.png" width ="65px" height = "65px" style="float:left " > | <img src ="https://upload.wikimedia.org/wikipedia/commons/thumb/9/9c/IntelliJ_IDEA_Icon.svg/70px-IntelliJ_IDEA_Icon.svg.png" width ="65px" height = "65px" >  |


## Demo Account
| <img src ="https://github.com/nazligencel/java-desktop-technical-service/blob/main/images/mail.png" width ="20px" height = "20px" style="float:left" > E-Mail | <img src ="https://github.com/nazligencel/java-desktop-technical-service/blob/main/images/password.png" width ="20px" height = "20px" style="float:left" > Password | 
| :------------: | :------------: | 
|nurullah@gmail.com| 12345 |

## Project Display Image
<br>

<p>
 <a href="https://github.com/emelyilmaz/SellingManagementProject/blob/main/projectimages/1.1.png" target="_blank">
<img src="https://github.com/emelyilmaz/SellingManagementProject/blob/main/projectimages/1.1.png" width="400" style="max-width:100%;"></a>
 <a href="https://github.com/emelyilmaz/SellingManagementProject/blob/main/projectimages/2.1.png" target="_blank">
<img src="https://github.com/emelyilmaz/SellingManagementProject/blob/main/projectimages/2.1.png" width="400" style="max-width:100%;"></a>
</p>
<br>

<p>
 <a href="https://github.com/emelyilmaz/SellingManagementProject/blob/main/projectimages/3.1.png" target="_blank">
<img src="https://github.com/emelyilmaz/SellingManagementProject/blob/main/projectimages/3.1.png" width="400" style="max-width:100%;"></a>
 
 <a href="https://github.com/emelyilmaz/SellingManagementProject/blob/main/projectimages/4.1.png" target="_blank">
<img src="https://github.com/emelyilmaz/SellingManagementProject/blob/main/projectimages/4.1.png" width="400" style="max-width:100%;"></a>
</p>
<br>

<p> 
 <a href="https://github.com/emelyilmaz/SellingManagementProject/blob/main/projectimages/5.1.png" target="_blank">
<img src="https://github.com/emelyilmaz/SellingManagementProject/blob/main/projectimages/5.1.png" width="400" style="max-width:100%;"></a>  
  <a href="https://github.com/emelyilmaz/SellingManagementProject/blob/main/projectimages/6.1.png" target="_blank">
<img src="https://github.com/emelyilmaz/SellingManagementProject/blob/main/projectimages/6.1.png" width="400" style="max-width:100%;"></a>  
 
<p/> 
<br>

<p>   
  <a href="https://github.com/emelyilmaz/SellingManagementProject/blob/main/projectimages/7.1.png" target="_blank">
<img src="https://github.com/emelyilmaz/SellingManagementProject/blob/main/projectimages/7.1.png" width="400" style="max-width:100%;"></a>
   <a href="https://github.com/emelyilmaz/SellingManagementProject/blob/main/projectimages/8.1.png" target="_blank">
<img src="https://github.com/emelyilmaz/SellingManagementProject/blob/main/projectimages/8.1.png" width="400" style="max-width:100%;"></a>
<p/> 
<br>

<p> 
  <a href="https://github.com/emelyilmaz/SellingManagementProject/blob/main/projectimages/9.1.png" target="_blank">
<img src="https://github.com/emelyilmaz/SellingManagementProject/blob/main/projectimages/9.1.png" width="400" style="max-width:100%;"></a>
   <a href="https://github.com/emelyilmaz/SellingManagementProject/blob/main/projectimages/10.1.png" target="_blank">
<img src="https://github.com/emelyilmaz/SellingManagementProject/blob/main/projectimages/10.1.png" width="400" style="max-width:100%;"></a>
<p/>
<br>

<p> 
 <a href="https://github.com/emelyilmaz/SellingManagementProject/blob/main/projectimages/11.1.png" target="_blank">
<img src="https://github.com/emelyilmaz/SellingManagementProject/blob/main/projectimages/11.1.png" width="400" style="max-width:100%;"></a>
   <a href="https://github.com/emelyilmaz/SellingManagementProject/blob/main/projectimages/12.1.png" target="_blank">
<img src="https://github.com/emelyilmaz/SellingManagementProject/blob/main/projectimages/12.1.png" width="400" style="max-width:100%;"></a>
</p> 
<br>

<p> 
<a href="https://github.com/emelyilmaz/SellingManagementProject/blob/main/projectimages/13.1.png" target="_blank">
<img src="https://github.com/emelyilmaz/SellingManagementProject/blob/main/projectimages/13.1.png" width="400" style="max-width:100%;"></a>
   <a href="https://github.com/emelyilmaz/SellingManagementProject/blob/main/projectimages/14.1.png" target="_blank">
<img src="https://github.com/emelyilmaz/SellingManagementProject/blob/main/projectimages/14.1.png" width="400" style="max-width:100%;"></a>
<p/> 
 


**Name:** Emel  <br>
**Surname:** Cesur Yılmaz <br>
**Email:** emelcesurr@gmail.com
