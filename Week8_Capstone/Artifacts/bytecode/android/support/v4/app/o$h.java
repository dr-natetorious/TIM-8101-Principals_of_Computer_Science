class android.support.v4.app.o$h implements android.support.v4.app.o$g {
  final java.lang.String a;

  final int b;

  final int c;

  final android.support.v4.app.o d;

  android.support.v4.app.o$h(android.support.v4.app.o, java.lang.String, int, int);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #20                 // Field d:Landroid/support/v4/app/o;
       5: aload_0
       6: invokespecial #23                 // Method java/lang/Object."<init>":()V
       9: aload_0
      10: aload_2
      11: putfield      #25                 // Field a:Ljava/lang/String;
      14: aload_0
      15: iload_3
      16: putfield      #27                 // Field b:I
      19: aload_0
      20: iload         4
      22: putfield      #29                 // Field c:I
      25: return

  public boolean a(java.util.ArrayList<android.support.v4.app.c>, java.util.ArrayList<java.lang.Boolean>);
    Code:
       0: aload_0
       1: getfield      #20                 // Field d:Landroid/support/v4/app/o;
       4: getfield      #35                 // Field android/support/v4/app/o.p:Landroid/support/v4/app/i;
       7: ifnull        48
      10: aload_0
      11: getfield      #27                 // Field b:I
      14: ifge          48
      17: aload_0
      18: getfield      #25                 // Field a:Ljava/lang/String;
      21: ifnonnull     48
      24: aload_0
      25: getfield      #20                 // Field d:Landroid/support/v4/app/o;
      28: getfield      #35                 // Field android/support/v4/app/o.p:Landroid/support/v4/app/i;
      31: invokevirtual #41                 // Method android/support/v4/app/i.peekChildFragmentManager:()Landroid/support/v4/app/n;
      34: astore_3
      35: aload_3
      36: ifnull        48
      39: aload_3
      40: invokevirtual #46                 // Method android/support/v4/app/n.c:()Z
      43: ifeq          48
      46: iconst_0
      47: ireturn
      48: aload_0
      49: getfield      #20                 // Field d:Landroid/support/v4/app/o;
      52: aload_1
      53: aload_2
      54: aload_0
      55: getfield      #25                 // Field a:Ljava/lang/String;
      58: aload_0
      59: getfield      #27                 // Field b:I
      62: aload_0
      63: getfield      #29                 // Field c:I
      66: invokevirtual #49                 // Method android/support/v4/app/o.a:(Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/lang/String;II)Z
      69: ireturn
}
