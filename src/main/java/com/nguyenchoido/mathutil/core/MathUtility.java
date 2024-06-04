/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nguyenchoido.mathutil.core;
//Quy tắc đặt tên package trong Java
//- Chữ thường toàn tập
//- Ghi theo tên miền công ty đảo ngược
//com.tên công ty.tên dự án.tên module - nhóm chức năng
//com.microsoft.sqlserver.jdbc.tên class import vào để dùng
//đây là kĩ thuật giúp code của nhiều dự án trong công ty có thể ở chung folder mà không bị lẫn lộn
//giúp thư viện của các công ty khác nhau ở chung với nhau dù trùng tên
//.NET: chiều xuôi, chữ hoa từng đầu từ
//Microsoft.Sdk.

//KMS (Katalon) com.kms.
//C# Nguyenchoido.MathUtil
//   Microsoft.MathUtil
/**
 *
 * @author trand
 */
public class MathUtility {

    //Hàm tính n! = 1.2.3.4...n
    //Hàm là static vì tính xong trả về, không nhớ nhung gì cả
    //Thường các thư viện dùng chung có tính toán số liệu ta hay thường dùng static
    //0! = 1! = 1
    //n = 0..20! vì n = 21! vượt 18 số 0, 18 sô 0 là vừa đủ long
    public static long getFactorial(int n) {
        long product = 1; //tích - kết quả phép nhân
        if (n < 0 || n > 20) {
            throw new IllegalArgumentException("Invalid n. n must be between 0 to 20");
        }

        if (n == 0) {
            return 1;
        }

        for (int i = 1; i <= n; i++) {
            product *= i; //thuật toán nhân dồn, con heo đất - ốc bu nhồi thịt
        }

        return product;
    }
}
