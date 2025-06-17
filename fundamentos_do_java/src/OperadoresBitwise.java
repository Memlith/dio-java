public class OperadoresBitwise {
  public static void main(String[] args) {
    var value4 = 12;
    var binary4 = Integer.toBinaryString(value4);
    System.out.printf("Primeiro numero da operacao = %s ( binario -> %s )\n", value4, binary4);
    var value5 = 2;
    var binary5 = Integer.toBinaryString(value5);
    System.out.printf("Segundo numero da operacao = %s ( binario -> %s )\n", value5, binary5);
    var result1 = value4 | value5;
    var binaryResult1 = Integer.toBinaryString(result1);
    System.out.printf(" %s | %s = %s ( binario -> %s )\n", value4, value5, result1, binaryResult1);
    /*
     * 1 1 0 0 | | | |(or) funciona tambem com &(and) e ^(xor) 0 0 1 0 = = = = 1 1 1
     * 0 visao verdadeira dos bits 0000000000001110
     */

    var result2 = ~value4;
    var binaryResult2 = Integer.toBinaryString(result2);
    System.out.printf(" ~%s = %s ( binario -> %s )\n", value4, result2, binaryResult2);
    /*
     * ~(complement) funciona como !(not) para binario visao verdadeira dos bits
     * 11111111111111111111111111110011
     */

    var result3 = value4 << value5;
    var binaryResult3 = Integer.toBinaryString(result3);
    System.out.printf(" %s << %s = %s ( binario -> %s )\n", value4, value5, result3, binaryResult3);
    /*
     * <<(left shift operator) 12 << 2(quantidade deslocada para a esquerda) antes
     * 00000000000000000000000000001100 depois 00000000000000000000000000110000
     * resultado = 48
     */
    var result4 = value4 >> value5;
    var binaryResult4 = Integer.toBinaryString(result4);
    System.out.printf(" %s >> %s = %s ( binario -> %s )\n", value4, value5, result4, binaryResult4);
    /*
     * >>(signed right shift operator) 12 >> 2(quantidade deslocada para a direita)
     * antes 00000000000000000000000000001100 depois
     * 000000000000000000000000000011|00(numeros fora do binario) resultado = 3 se
     * for -12 >> 2 antes 00000000000000000000000000001100 depois
     * 1111111111111111|00(numeros fora do binario) resultado = -3
     */
    var result5 = value4 >>> value5;
    var binaryResult5 = Integer.toBinaryString(result5);
    System.out.printf(" %s >>> %s = %s ( binario -> %s )\n", value4, value5, result5, binaryResult5);
    /*
     * >>>(unsigned right shift operator) 12 >>> 2(quantidade deslocada para a
     * direita) antes 00000000000000000000000000001100 depois
     * 000000000000000000000000000011|00(numeros fora do binario) resultado = 3
     */
  }
}
