package recognition01_new;

import java.sql.Connection;

import java.sql.DriverManager;

import java.sql.SQLException;

import java.sql.Statement;

import java.util.HashMap;

import java.util.Map;


public class MySQL {

    String driver;// JDBC�h���C�o�̓o�^

    String server, dbname, url, user, password;// �f�[�^�x�[�X�̎w��

    Connection con;

    Statement stmt;

    Map<String, Object> lng = new HashMap<>();

	private String id;

    

    public MySQL() {

        this.driver = "org.gjt.mm.mysql.Driver";

        this.server = "sangi2018.sist.ac.jp";

        this.dbname = "sangi2018";

        this.url = "jdbc:mysql://" + server + "/" + dbname + "?useUnicode=true&characterEncoding=UTF-8";

        this.user = "sangi2018";

        this.password = "sistsangi2018";
        
        this.id ="1618006";

        try {

            this.con = DriverManager.getConnection(url, user, password);

            this.stmt = con.createStatement ();

        } catch (SQLException e) {

            e.printStackTrace();

        }

        try {

            Class.forName (driver);

        } catch (ClassNotFoundException e) {

            e.printStackTrace();

        }

    }


    public void updateImage(int age_min, int age_max, double age_score, int gender, double gender_score) {

        // TODO Auto-generated method stub

        StringBuffer buf = new StringBuffer();

        //String id = "1618006";

        buf.append("INSERT INTO `faces`(`user_id`, `age_min`, `age_max`, `age_score`, `gender`, `gender_score`) VALUES ("+ id +"," + age_min +","+ age_max +","+age_score+","+gender+","+gender_score+");");

        String sql = buf.toString();

        try {

            stmt.execute (sql);

        } catch (SQLException e) {

            // TODO Auto-generated catch block

            e.printStackTrace();

        }

    }




}


