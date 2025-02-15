public class IllegalStateException extends RuntimeException {
    public IllegalStateException ( String attrName ){
        super( "Чекеру не установлен аттрибут: " + attrName );
    }
}
