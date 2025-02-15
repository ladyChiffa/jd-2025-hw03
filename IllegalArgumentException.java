public class IllegalArgumentException extends RuntimeException {
    public IllegalArgumentException( int count ){
        super( "Нельзя передавать значение <0, передали: " + count );
    }
}
