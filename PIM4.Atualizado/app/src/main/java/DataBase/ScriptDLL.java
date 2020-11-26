package DataBase;

public class ScriptDLL {
    public static String getCreateTableCliente(){
        StringBuilder sql = new StringBuilder();
        sql.append("CREATE TABLE [dbo].[User]")
        sql.append  ("[IdUser]    INT             IDENTITY (1, 1) NOT NULL (''),");
        sql.append("[Username]  NVARCHAR (15)   NOT NULL (''),");
        sql.append("[Email]     NVARCHAR (30)   NOT NULL (''),");
        sql.append("[Password]  NVARCHAR (20)   NOT NULL (''),");
        sql.append("[Birthday]  NVARCHAR (10)   NOT NULL (''),");
        sql.append("[Document]  NVARCHAR (20)   NOT NULL (''),");
        sql.append("[btcValue]  NUMERIC (16, 8) NOT NULL (''),");
        sql.append("[ethValue]  NUMERIC (16, 8) NOT NULL (''),");
        sql.append("[dogeValue] NUMERIC (16, 8) NOT NULL (''),");
        sql.append("[usdtValue] NUMERIC (16, 8) NOT NULL (''),");
        sql.append("[xrpValue]  NUMERIC (16, 8) NOT NULL (''),");
        sql.append("CONSTRAINT [PK_User] PRIMARY KEY CLUSTERED ([IdUser] ASC (''),");

        return sql.toString();

);
    }
}
