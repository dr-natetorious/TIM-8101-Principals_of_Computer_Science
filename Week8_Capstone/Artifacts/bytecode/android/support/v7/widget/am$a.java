class android.support.v7.widget.am$a {
  public android.support.v7.widget.RecyclerView$x a;

  public android.support.v7.widget.RecyclerView$x b;

  public int c;

  public int d;

  public int e;

  public int f;

  android.support.v7.widget.am$a(android.support.v7.widget.RecyclerView$x, android.support.v7.widget.RecyclerView$x, int, int, int, int);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: invokespecial #27                 // Method "<init>":(Landroid/support/v7/widget/RecyclerView$x;Landroid/support/v7/widget/RecyclerView$x;)V
       6: aload_0
       7: iload_3
       8: putfield      #29                 // Field c:I
      11: aload_0
      12: iload         4
      14: putfield      #31                 // Field d:I
      17: aload_0
      18: iload         5
      20: putfield      #33                 // Field e:I
      23: aload_0
      24: iload         6
      26: putfield      #35                 // Field f:I
      29: return

  public java.lang.String toString();
    Code:
       0: new           #39                 // class java/lang/StringBuilder
       3: dup
       4: invokespecial #40                 // Method java/lang/StringBuilder."<init>":()V
       7: astore_1
       8: aload_1
       9: ldc           #42                 // String ChangeInfo{oldHolder=
      11: invokevirtual #46                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      14: pop
      15: aload_1
      16: aload_0
      17: getfield      #21                 // Field a:Landroid/support/v7/widget/RecyclerView$x;
      20: invokevirtual #49                 // Method java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
      23: pop
      24: aload_1
      25: ldc           #51                 // String , newHolder=
      27: invokevirtual #46                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      30: pop
      31: aload_1
      32: aload_0
      33: getfield      #23                 // Field b:Landroid/support/v7/widget/RecyclerView$x;
      36: invokevirtual #49                 // Method java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
      39: pop
      40: aload_1
      41: ldc           #53                 // String , fromX=
      43: invokevirtual #46                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      46: pop
      47: aload_1
      48: aload_0
      49: getfield      #29                 // Field c:I
      52: invokevirtual #56                 // Method java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
      55: pop
      56: aload_1
      57: ldc           #58                 // String , fromY=
      59: invokevirtual #46                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      62: pop
      63: aload_1
      64: aload_0
      65: getfield      #31                 // Field d:I
      68: invokevirtual #56                 // Method java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
      71: pop
      72: aload_1
      73: ldc           #60                 // String , toX=
      75: invokevirtual #46                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      78: pop
      79: aload_1
      80: aload_0
      81: getfield      #33                 // Field e:I
      84: invokevirtual #56                 // Method java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
      87: pop
      88: aload_1
      89: ldc           #62                 // String , toY=
      91: invokevirtual #46                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      94: pop
      95: aload_1
      96: aload_0
      97: getfield      #35                 // Field f:I
     100: invokevirtual #56                 // Method java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
     103: pop
     104: aload_1
     105: bipush        125
     107: invokevirtual #65                 // Method java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
     110: pop
     111: aload_1
     112: invokevirtual #67                 // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
     115: areturn
}
