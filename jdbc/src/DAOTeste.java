public class DAOTeste {
    public static void main(String[] args) {
        DAO dao = new DAO();

        String sql = "INSERT IGNORE INTO pessoas (nome) VALUES (?)";
        System.out.println(dao.incluir(sql, "joao da silva"));
        System.out.println
                (dao.incluir(sql, "niege"));
        System.out.println(
                dao.incluir(sql, "dudu"));
        System.out.println(
                dao.incluir(sql, "maria"));

        dao.close();
    }
}
