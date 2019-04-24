public class android.support.v4.g.e extends java.io.Writer {
  public android.support.v4.g.e(java.lang.String);
    Code:
       0: aload_0
       1: invokespecial #13                 // Method java/io/Writer."<init>":()V
       4: aload_0
       5: new           #15                 // class java/lang/StringBuilder
       8: dup
       9: sipush        128
      12: invokespecial #18                 // Method java/lang/StringBuilder."<init>":(I)V
      15: putfield      #20                 // Field b:Ljava/lang/StringBuilder;
      18: aload_0
      19: aload_1
      20: putfield      #22                 // Field a:Ljava/lang/String;
      23: return

  public void close();
    Code:
       0: aload_0
       1: invokespecial #44                 // Method a:()V
       4: return

  public void flush();
    Code:
       0: aload_0
       1: invokespecial #44                 // Method a:()V
       4: return

  public void write(char[], int, int);
    Code:
       0: iconst_0
       1: istore        5
       3: iload         5
       5: iload_3
       6: if_icmpge     50
       9: aload_1
      10: iload_2
      11: iload         5
      13: iadd
      14: caload
      15: istore        4
      17: iload         4
      19: bipush        10
      21: if_icmpne     31
      24: aload_0
      25: invokespecial #44                 // Method a:()V
      28: goto          41
      31: aload_0
      32: getfield      #20                 // Field b:Ljava/lang/StringBuilder;
      35: iload         4
      37: invokevirtual #51                 // Method java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
      40: pop
      41: iload         5
      43: iconst_1
      44: iadd
      45: istore        5
      47: goto          3
      50: return
}
