public class R3Vector {
    private float NewX, NewY, NewZ;

    public R3Vector() {
        System.out.println("Ошибка ввода");
    }

    public R3Vector(float x, float y, float z) {
        this.NewX = x;
        this.NewY = y;
        this.NewZ = z;

    }

    public static R3Vector V_summ(R3Vector A, R3Vector B) {
        A.NewX += B.NewX;
        A.NewY += B.NewY;;
        A.NewZ += B.NewZ;
        return new R3Vector(A.NewX,A.NewY,A.NewZ);
    }

    public static R3Vector V_sub(R3Vector A, R3Vector B) {
        A.NewX -= B.NewX;
        A.NewY -= B.NewY;;
        A.NewZ -= B.NewZ;
        return new R3Vector(A.NewX,A.NewY,A.NewZ);
    }

    public static R3Vector V_mult(R3Vector A, float B) {
        A.NewX *= B;
        A.NewY *= B;;
        A.NewZ *= B;
        return new R3Vector(A.NewX,A.NewY,A.NewZ);
    }

    public static float Scolar_mult(R3Vector A, R3Vector B) {
        return (A.NewX * B.NewX + A.NewY * B.NewY + A.NewZ * B.NewZ);
    }
    public static R3Vector Vector_mult(R3Vector A, R3Vector B) {
        float x = A.NewY * B.NewZ - A.NewZ * B.NewY;
        float y = A.NewZ * B.NewX - A.NewX * B.NewZ;
        float z = A.NewX * B.NewY - A.NewY * B.NewX;
        return new R3Vector(x,y,z);
    }
    public static float V_mixed(R3Vector A, R3Vector B, R3Vector C) {
        A = R3Vector.Vector_mult(A, B);
        return R3Vector.Scolar_mult(A, C);
    }
    public static void return_vector(R3Vector A){
        System.out.println("("+A.NewX+" "+A.NewY+" "+A.NewZ+")");
    }


}