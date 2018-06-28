package br.com.estok.util;


    import java.sql.Connection;
    import java.sql.DriverManager;
    import java.sql.PreparedStatement;
    import java.sql.ResultSet;
    import java.sql.SQLException;
    import javax.swing.JOptionPane;

public class ConnectionFactory{

    final private static String DRIVER = "com.mysql.jdbc.Driver";
    final private static String URL = "jdbc:mysql://192.168.0.115:3306/farmatec";
    final private static String USUARIO = "root";
    final private static String SENHA = "";
    private static Connection mConexao;

    public static Object getInstance() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public PreparedStatement statement;
    ResultSet resultset;


public static Connection conectar() throws Exception{
    Class.forName(DRIVER);
    mConexao = DriverManager.getConnection(URL,USUARIO,SENHA);
    return mConexao;
}







public boolean getObterDados()
{
    boolean result = true;
    try
    {
        Class.forName(DRIVER);
        mConexao = DriverManager.getConnection(URL, USUARIO, SENHA);
    }
    catch(ClassNotFoundException Driver)
    {
        JOptionPane.showMessageDialog(null, "Driver nao localizado"+Driver);
        result = false;
    }
    catch(SQLException Fonte)
    {
        JOptionPane.showMessageDialog(null, "Deu erro com a conexao"+"com a fonte de dados"+Fonte);
    result = false;
    }
    return result;
}

public ResultSet executeSQL(String sql)
{
    try
    {
//        statement = mConexao.createStatement(resultset.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
        StringBuffer sb = new StringBuffer(sql);

        statement = mConexao.prepareStatement(sb.toString());
        resultset = statement.executeQuery();
    }
    catch(SQLException sqlex)
    {
        JOptionPane.showMessageDialog(null, "Nao foi possivel"+"executar o comando sql,"+sqlex+", o sql passado foi"+ sql);
    }
    return resultset;
}


}