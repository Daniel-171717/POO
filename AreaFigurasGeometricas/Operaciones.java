package ExamenP1S2;

public class Operaciones {
    public double base;
    public double altura;
    public Operaciones (double base, double altura)
    {
        this.base=base;
        this.altura=altura;
    }

    public double GetTriangulo()
    {
        return (base*altura)/2;
    }

    public double GetRectangulo()
    {
        return base*altura;
    }
}
