public abstract class ryey.easer.commons.b {
  public ryey.easer.commons.b(int, java.lang.String);
    Code:
       0: aload_0
       1: invokespecial #15                 // Method java/lang/Object."<init>":()V
       4: aload_0
       5: iconst_0
       6: putfield      #17                 // Field c:I
       9: aload_0
      10: iload_1
      11: newarray       boolean
      13: putfield      #19                 // Field b:[Z
      16: aload_0
      17: aload_2
      18: putfield      #21                 // Field a:Ljava/lang/String;
      21: return

  public abstract void a();

  public void a(int);
    Code:
       0: aload_0
       1: getfield      #21                 // Field a:Ljava/lang/String;
       4: ifnull        30
       7: ldc           #25                 // String [%s] tick on %d
       9: iconst_2
      10: anewarray     #4                  // class java/lang/Object
      13: dup
      14: iconst_0
      15: aload_0
      16: getfield      #21                 // Field a:Ljava/lang/String;
      19: aastore
      20: dup
      21: iconst_1
      22: iload_1
      23: invokestatic  #31                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
      26: aastore
      27: invokestatic  #36                 // Method com/b/a/i.a:(Ljava/lang/String;[Ljava/lang/Object;)V
      30: aload_0
      31: getfield      #19                 // Field b:[Z
      34: iload_1
      35: baload
      36: ifne          49
      39: aload_0
      40: aload_0
      41: getfield      #17                 // Field c:I
      44: iconst_1
      45: iadd
      46: putfield      #17                 // Field c:I
      49: aload_0
      50: getfield      #19                 // Field b:[Z
      53: iload_1
      54: iconst_1
      55: bastore
      56: aload_0
      57: getfield      #17                 // Field c:I
      60: aload_0
      61: getfield      #19                 // Field b:[Z
      64: arraylength
      65: if_icmplt     72
      68: aload_0
      69: invokevirtual #38                 // Method a:()V
      72: return
}
