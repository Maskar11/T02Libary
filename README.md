# T02Libary//Program calisinca HOSGELDINIZ ve Giris yap sayfasi gelir
// Giris yap icin menude iki secenek olur
// ************* GIRIS MENUSU*************
//       1. Admin Olarak Giris Yap
//       2. Member Olarak Giris Yap


//Admin Olarak Giris Yap secilirse kullanicidan username ve password girilmesi istenir
//username ve password'un dogrulugu check edilir 
//Giris bilgileri dogru ise Admin Islem menusu ekrana gelir

// ************* ADMIN ISLEM MENUSU*************
//        1. Kitap Islemler
//        2. Member Islemleri 
//        3. Diger Islemler
//        4. Cikis


//Eger Admin Kitap islemlerini secerse Kitap islemleri menusu gelsin
// ************* KITAP ISLEMLERI MENUSU*************
//1. Kitap Ekle
//2. Kitap Sil
//3. Kitap Update Et
//4. Kitap Bul
//5. Kitaplari listele
//6.Cikis


//Eger Admin Kitaplari Listele secerse Kitaplari Listele menusu gelsin
// ************* LISTELEME MENUSU*************
//1.Kitap Ismine Gore Listele
//2.Yazara Gore Listele
//3.Turune Gore Listele
//4. Cikis

//Member Olarak Giris Yap secilirse kullanicidan username ve password girilmesi istenir
//username ve password'un dogrulugu check edilir 
//user name ve password doru use member islemleri menusu gelir
//************ MEMBER ICIN MEMBER ISLEMLERI MENUSU*************
//1. Kitap Bul
//2. Kitap Al
//3. Kitap Listele
//4. Kitap Geri ver
//5. Cikis

//Eger Admin Member islemlerini secerse Member islemleri menusu gelsin
// ************* ADMIN ICIN MEMBER ISLEMLERI MENUSU*************
//1. Member Ekle
//2. Member Sil
//3. Membber Update Et
//4. Member'lari Listele
//5. Member Bul ve Bilgilerini Goruntule
//6. Cikis



############################## Classes #############################
# Book
    * ISBN int veya string
    * BookName string
    + description string
    > LAnguage string
    * Authour string
    * Type string
    * PageCount int
    > Status int 1 stock 0 barrowed 
    > memberid int 
    > barrowed_date date
    > expected_date date
   

# Person
    > Fullname string
    > email string
    > phone string
    > address string
    > DoB date or string
    -- Bahadir Gok

# member extends person
    > memberid int
    > username string
    > password string
    > status int 0 pasif 1 aktif -1 cezali 
    > MerbershipStarting date *
    > LastLoginAt time *
    
# Admin extends person
    > Adminid int
    > username string
    > password string
--Taha yavas

