//Đề bài
//Hệ thống có các role sau đây:
//
//ADMIN
//SALE
//AUTHOR

//USER
//Định nghĩa các controller và phần quyền cho user sử dụng:
//
//Cấu hình phân quyền cho ứng dụng sử dụng Method Security
//Danh sách API
//Xem dashboard - ADMIN, SALE
//Quản lý user (CRU) - ADMIN
//Quản lý category (CRUD) ADMIN, SALE
//Quản lý sản phẩm (CRUD) ADMIN, SALE

//Quản lý brand (CRUD) ADMIN, SALE
//Quản lý order (CRU) ADMIN, SALE
//Quản lý bài viết (CRUD) ADMIN, SALE, AUTHOR
//Xem thông tin cá nhân, thay đổi thông tin cá nhân USER
//Chỉ cần định nghĩa controller và phần quyền, controller trả về cái gì cũng được (không cần xử lý phức tạp)
package vn.scrip.buoi34_bvn;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication

public class Buoi34BvnApplication {

	public static void main(String[] args) {
		SpringApplication.run(Buoi34BvnApplication.class, args);
	}

}




