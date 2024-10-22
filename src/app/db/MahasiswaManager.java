package app.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class MahasiswaManager {

    Connection conn = null;
    Statement st = null;
    String driver = "com.mysql.cj.jdbc.Driver";
    String url = "jdbc:mysql://localhost:3306/db_unidha";

    public MahasiswaManager() {
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, "root", "");
            st = conn.createStatement();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    public List getMahasiswa() {
        ResultSet rs = null;
        List Mahasiswa = new ArrayList();
        try {
            rs = st.executeQuery("Select * From tbl_mahasiswa");
            while (rs.next()) {
                Mahasiswa m = new Mahasiswa();
                m.setnobp(rs.getString("NoBP"));
                m.setnama(rs.getString("Nama"));
                m.settmplahir(rs.getString("TmpLahir"));
                m.settgllahir(rs.getString("TglLahir"));
                m.setalamat(rs.getString("Alamat"));
                m.setphone(rs.getString("Phone"));
                m.setasalsekolah(rs.getString("AsalSekolah"));
                Mahasiswa.add(m);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return Mahasiswa;
    }

    public int Insert(Mahasiswa m) {
        int result = 0;
        try {
            result = st.executeUpdate("insert into tbl_mahasiswa value('"+ m.getnobp() +"'  ,'"+ m.getnama() +"'  ,'"+ m.gettmplahir() + "','" + m.gettgllahir() + "','" + m.getalamat() + "','" + m.getphone() + "','" + m.getasalsekolah() + "')"); 
 } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }

    public int Delete(Mahasiswa m) {
        int result = 0;
        try {
            result = st.executeUpdate("delete from tbl_mahasiswa where nobp ='"+ m.getnobp() +"'  ");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }

    public int Update(Mahasiswa m) {
        int result = 0;
        try {
            result = st.executeUpdate("update tbl_mahasiswa set nobp = " + m.getnobp() + "',nama='" + m.getnama() + "',tmplahir='"+ m.gettmplahir() + "',tgllahir='" + m.gettgllahir() + "',Alamat='" + m.getalamat() + "',phone='" + m.getphone() + "',asalsekolah='" + m.getasalsekolah() + "'where nobp ='" + m.getnobp() +"'");

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }

    public void closeConnection() {
        try {
            conn.close();
            st.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
