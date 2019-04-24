public class android.support.v4.g.j<F, S> {
  public final F a;

  public final S b;

  public boolean equals(java.lang.Object);
    Code:
       0: aload_1
       1: instanceof    #2                  // class android/support/v4/g/j
       4: istore_2
       5: iconst_0
       6: istore_3
       7: iload_2
       8: ifne          13
      11: iconst_0
      12: ireturn
      13: aload_1
      14: checkcast     #2                  // class android/support/v4/g/j
      17: astore_1
      18: iload_3
      19: istore_2
      20: aload_1
      21: getfield      #18                 // Field a:Ljava/lang/Object;
      24: aload_0
      25: getfield      #18                 // Field a:Ljava/lang/Object;
      28: invokestatic  #20                 // Method a:(Ljava/lang/Object;Ljava/lang/Object;)Z
      31: ifeq          52
      34: iload_3
      35: istore_2
      36: aload_1
      37: getfield      #22                 // Field b:Ljava/lang/Object;
      40: aload_0
      41: getfield      #22                 // Field b:Ljava/lang/Object;
      44: invokestatic  #20                 // Method a:(Ljava/lang/Object;Ljava/lang/Object;)Z
      47: ifeq          52
      50: iconst_1
      51: istore_2
      52: iload_2
      53: ireturn

  public int hashCode();
    Code:
       0: aload_0
       1: getfield      #18                 // Field a:Ljava/lang/Object;
       4: astore_3
       5: iconst_0
       6: istore_2
       7: aload_3
       8: ifnonnull     16
      11: iconst_0
      12: istore_1
      13: goto          24
      16: aload_0
      17: getfield      #18                 // Field a:Ljava/lang/Object;
      20: invokevirtual #26                 // Method java/lang/Object.hashCode:()I
      23: istore_1
      24: aload_0
      25: getfield      #22                 // Field b:Ljava/lang/Object;
      28: ifnonnull     34
      31: goto          42
      34: aload_0
      35: getfield      #22                 // Field b:Ljava/lang/Object;
      38: invokevirtual #26                 // Method java/lang/Object.hashCode:()I
      41: istore_2
      42: iload_1
      43: iload_2
      44: ixor
      45: ireturn

  public java.lang.String toString();
    Code:
       0: new           #30                 // class java/lang/StringBuilder
       3: dup
       4: invokespecial #34                 // Method java/lang/StringBuilder."<init>":()V
       7: astore_1
       8: aload_1
       9: ldc           #36                 // String Pair{
      11: invokevirtual #40                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      14: pop
      15: aload_1
      16: aload_0
      17: getfield      #18                 // Field a:Ljava/lang/Object;
      20: invokestatic  #46                 // Method java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
      23: invokevirtual #40                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      26: pop
      27: aload_1
      28: ldc           #48                 // String
      30: invokevirtual #40                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      33: pop
      34: aload_1
      35: aload_0
      36: getfield      #22                 // Field b:Ljava/lang/Object;
      39: invokestatic  #46                 // Method java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
      42: invokevirtual #40                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      45: pop
      46: aload_1
      47: ldc           #50                 // String }
      49: invokevirtual #40                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      52: pop
      53: aload_1
      54: invokevirtual #52                 // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
      57: areturn
}
