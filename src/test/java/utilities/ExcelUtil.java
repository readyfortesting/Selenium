package utilities;

public class ExcelUtil {
    public ExcelUtil(String path, String sheetName) {
    }

    public String[][] getDataArrayWithoutFirstRow(){
        String[][] data=new String[rowCount()-1][columnCount()];
        for (int i=1; i< rowCount(); i++){
            for (int j=0; j < columnCount();j++){
                String value=getCellData(i,j);
                data[i-1][j]=value;
            }
        }
        return data;
    }

    private int rowCount() {
        return 0;
    }

    private int columnCount() {
        return 0;
    }

    private String getCellData(int i, int j) {
        return null;
    }
}
