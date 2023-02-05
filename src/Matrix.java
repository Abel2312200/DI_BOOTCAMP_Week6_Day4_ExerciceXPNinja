public class Matrix {
    // class attributes
    private int rows;
    private int columns;
    private double[][] elements;

    // constructor without parameters
    public Matrix() {
        super();
    }

    // constructor using parameters
    public Matrix(int rows, int columns) {
        super();
        this.rows = rows;
        this.columns = columns;
        this.elements = new double[rows][columns];

    }
    public Matrix(int rows, int columns, double[][] elements) {
        this(rows,columns);
        this.elements = elements;
    }

    // getters and setters

    public double[][] getElements() {
        return elements;
    }

    public void setElements(double[][] elements) {
        this.elements = elements;
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public int getColumns() {
        return columns;
    }

    public void setColumns(int columns) {
        this.columns = columns;
    }

    // class methods

    public Matrix add(Matrix m){
        if((this.columns == m.getColumns()) && (this.rows ==  m.getRows())){
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    this.elements[i][j] = m.getElements()[i][j]; // sum elements
                }
            }
        }else{
            System.out.println("Matrix cannot be added");
        }
        return this;
    }

    public Matrix multiply(Matrix m){
        Matrix multMatrix = new Matrix();
        if (this.columns == m.getRows()){

            // update rows and column values of multi
            multMatrix.setRows(m.getRows());
            multMatrix.setColumns(m.getColumns());
            // update number of columns
            for (int i = 0; i < this.rows; i++) {
                for (int j = 0; j < m.getColumns(); j++) {
                    multMatrix.elements[j][i] += this.elements[i][j];
                }
            }
        }else {
            System.out.println("Matrix cannot be added .");
        }
        return multMatrix;
    }
}
