class android.support.v7.widget.au {
  boolean a;

  int b;

  int c;

  int d;

  int e;

  int f;

  int g;

  boolean h;

  boolean i;

  android.support.v7.widget.au();
    Code:
       0: aload_0
       1: invokespecial #19                 // Method java/lang/Object."<init>":()V
       4: aload_0
       5: iconst_1
       6: putfield      #21                 // Field a:Z
       9: aload_0
      10: iconst_0
      11: putfield      #23                 // Field f:I
      14: aload_0
      15: iconst_0
      16: putfield      #25                 // Field g:I
      19: return

  android.view.View a(android.support.v7.widget.RecyclerView$p);
    Code:
       0: aload_1
       1: aload_0
       2: getfield      #29                 // Field c:I
       5: invokevirtual #34                 // Method android/support/v7/widget/RecyclerView$p.c:(I)Landroid/view/View;
       8: astore_1
       9: aload_0
      10: aload_0
      11: getfield      #29                 // Field c:I
      14: aload_0
      15: getfield      #36                 // Field d:I
      18: iadd
      19: putfield      #29                 // Field c:I
      22: aload_1
      23: areturn

  boolean a(android.support.v7.widget.RecyclerView$u);
    Code:
       0: aload_0
       1: getfield      #29                 // Field c:I
       4: iflt          20
       7: aload_0
       8: getfield      #29                 // Field c:I
      11: aload_1
      12: invokevirtual #42                 // Method android/support/v7/widget/RecyclerView$u.e:()I
      15: if_icmpge     20
      18: iconst_1
      19: ireturn
      20: iconst_0
      21: ireturn

  public java.lang.String toString();
    Code:
       0: new           #46                 // class java/lang/StringBuilder
       3: dup
       4: invokespecial #47                 // Method java/lang/StringBuilder."<init>":()V
       7: astore_1
       8: aload_1
       9: ldc           #49                 // String LayoutState{mAvailable=
      11: invokevirtual #53                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      14: pop
      15: aload_1
      16: aload_0
      17: getfield      #55                 // Field b:I
      20: invokevirtual #58                 // Method java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
      23: pop
      24: aload_1
      25: ldc           #60                 // String , mCurrentPosition=
      27: invokevirtual #53                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      30: pop
      31: aload_1
      32: aload_0
      33: getfield      #29                 // Field c:I
      36: invokevirtual #58                 // Method java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
      39: pop
      40: aload_1
      41: ldc           #62                 // String , mItemDirection=
      43: invokevirtual #53                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      46: pop
      47: aload_1
      48: aload_0
      49: getfield      #36                 // Field d:I
      52: invokevirtual #58                 // Method java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
      55: pop
      56: aload_1
      57: ldc           #64                 // String , mLayoutDirection=
      59: invokevirtual #53                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      62: pop
      63: aload_1
      64: aload_0
      65: getfield      #66                 // Field e:I
      68: invokevirtual #58                 // Method java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
      71: pop
      72: aload_1
      73: ldc           #68                 // String , mStartLine=
      75: invokevirtual #53                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      78: pop
      79: aload_1
      80: aload_0
      81: getfield      #23                 // Field f:I
      84: invokevirtual #58                 // Method java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
      87: pop
      88: aload_1
      89: ldc           #70                 // String , mEndLine=
      91: invokevirtual #53                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      94: pop
      95: aload_1
      96: aload_0
      97: getfield      #25                 // Field g:I
     100: invokevirtual #58                 // Method java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
     103: pop
     104: aload_1
     105: bipush        125
     107: invokevirtual #73                 // Method java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
     110: pop
     111: aload_1
     112: invokevirtual #75                 // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
     115: areturn
}
