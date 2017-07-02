package bangtanrut.songklod.bookgazebo;

/**
 * Created by Administrator on 2/4/2560.
 */

public class MyConstant {

    //For URL
    private String urlPostUser = "http://coderobot.webstarterz.com/coderobot.webstarterz.com/bauy/app/postUser.php";
    private String urlGetUser = "http://coderobot.webstarterz.com/coderobot.webstarterz.com/bauy/app/getUser.php";


    //For General
    private String[] columnUserStrings = new String[]{
            "id",
            "Name",
            "Surname",
            "IdCard",
            "Address",
            "Phone",
            "User",
            "Password",
            "Status"};

    public String getUrlGetUser() {
        return urlGetUser;
    }

    public String[] getColumnUserStrings() {
        return columnUserStrings;
    }

    public String getUrlPostUser() {
        return urlPostUser;
    }
}//main class
