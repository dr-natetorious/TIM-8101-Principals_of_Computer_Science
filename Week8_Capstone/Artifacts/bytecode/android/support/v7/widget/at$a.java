class android.support.v7.widget.at$a implements android.support.v7.widget.RecyclerView$i$a {
  int a;

  int b;

  int[] c;

  int d;

  android.support.v7.widget.at$a();
    Code:
       0: aload_0
       1: invokespecial #18                 // Method java/lang/Object."<init>":()V
       4: return

  void a();
    Code:
       0: aload_0
       1: getfield      #21                 // Field c:[I
       4: ifnull        15
       7: aload_0
       8: getfield      #21                 // Field c:[I
      11: iconst_m1
      12: invokestatic  #27                 // Method java/util/Arrays.fill:([II)V
      15: aload_0
      16: iconst_0
      17: putfield      #29                 // Field d:I
      20: return

  void a(int, int);
    Code:
       0: aload_0
       1: iload_1
       2: putfield      #32                 // Field a:I
       5: aload_0
       6: iload_2
       7: putfield      #34                 // Field b:I
      10: return

  void a(android.support.v7.widget.RecyclerView, boolean);
    Code:
       0: aload_0
       1: iconst_0
       2: putfield      #29                 // Field d:I
       5: aload_0
       6: getfield      #21                 // Field c:[I
       9: ifnull        20
      12: aload_0
      13: getfield      #21                 // Field c:[I
      16: iconst_m1
      17: invokestatic  #27                 // Method java/util/Arrays.fill:([II)V
      20: aload_1
      21: getfield      #41                 // Field android/support/v7/widget/RecyclerView.m:Landroid/support/v7/widget/RecyclerView$i;
      24: astore_3
      25: aload_1
      26: getfield      #45                 // Field android/support/v7/widget/RecyclerView.l:Landroid/support/v7/widget/RecyclerView$a;
      29: ifnull        127
      32: aload_3
      33: ifnull        127
      36: aload_3
      37: invokevirtual #51                 // Method android/support/v7/widget/RecyclerView$i.p:()Z
      40: ifeq          127
      43: iload_2
      44: ifeq          72
      47: aload_1
      48: getfield      #55                 // Field android/support/v7/widget/RecyclerView.e:Landroid/support/v7/widget/f;
      51: invokevirtual #59                 // Method android/support/v7/widget/f.d:()Z
      54: ifne          96
      57: aload_3
      58: aload_1
      59: getfield      #45                 // Field android/support/v7/widget/RecyclerView.l:Landroid/support/v7/widget/RecyclerView$a;
      62: invokevirtual #64                 // Method android/support/v7/widget/RecyclerView$a.a:()I
      65: aload_0
      66: invokevirtual #67                 // Method android/support/v7/widget/RecyclerView$i.a:(ILandroid/support/v7/widget/RecyclerView$i$a;)V
      69: goto          96
      72: aload_1
      73: invokevirtual #70                 // Method android/support/v7/widget/RecyclerView.v:()Z
      76: ifne          96
      79: aload_3
      80: aload_0
      81: getfield      #32                 // Field a:I
      84: aload_0
      85: getfield      #34                 // Field b:I
      88: aload_1
      89: getfield      #74                 // Field android/support/v7/widget/RecyclerView.C:Landroid/support/v7/widget/RecyclerView$u;
      92: aload_0
      93: invokevirtual #77                 // Method android/support/v7/widget/RecyclerView$i.a:(IILandroid/support/v7/widget/RecyclerView$u;Landroid/support/v7/widget/RecyclerView$i$a;)V
      96: aload_0
      97: getfield      #29                 // Field d:I
     100: aload_3
     101: getfield      #80                 // Field android/support/v7/widget/RecyclerView$i.x:I
     104: if_icmple     127
     107: aload_3
     108: aload_0
     109: getfield      #29                 // Field d:I
     112: putfield      #80                 // Field android/support/v7/widget/RecyclerView$i.x:I
     115: aload_3
     116: iload_2
     117: putfield      #84                 // Field android/support/v7/widget/RecyclerView$i.y:Z
     120: aload_1
     121: getfield      #87                 // Field android/support/v7/widget/RecyclerView.d:Landroid/support/v7/widget/RecyclerView$p;
     124: invokevirtual #91                 // Method android/support/v7/widget/RecyclerView$p.b:()V
     127: return

  boolean a(int);
    Code:
       0: aload_0
       1: getfield      #21                 // Field c:[I
       4: ifnull        40
       7: aload_0
       8: getfield      #29                 // Field d:I
      11: istore_3
      12: iconst_0
      13: istore_2
      14: iload_2
      15: iload_3
      16: iconst_2
      17: imul
      18: if_icmpge     40
      21: aload_0
      22: getfield      #21                 // Field c:[I
      25: iload_2
      26: iaload
      27: iload_1
      28: if_icmpne     33
      31: iconst_1
      32: ireturn
      33: iload_2
      34: iconst_2
      35: iadd
      36: istore_2
      37: goto          14
      40: iconst_0
      41: ireturn

  public void b(int, int);
    Code:
       0: iload_1
       1: ifge          14
       4: new           #94                 // class java/lang/IllegalArgumentException
       7: dup
       8: ldc           #96                 // String Layout positions must be non-negative
      10: invokespecial #99                 // Method java/lang/IllegalArgumentException."<init>":(Ljava/lang/String;)V
      13: athrow
      14: iload_2
      15: ifge          28
      18: new           #94                 // class java/lang/IllegalArgumentException
      21: dup
      22: ldc           #101                // String Pixel distance must be non-negative
      24: invokespecial #99                 // Method java/lang/IllegalArgumentException."<init>":(Ljava/lang/String;)V
      27: athrow
      28: aload_0
      29: getfield      #29                 // Field d:I
      32: iconst_2
      33: imul
      34: istore_3
      35: aload_0
      36: getfield      #21                 // Field c:[I
      39: ifnonnull     60
      42: aload_0
      43: iconst_4
      44: newarray       int
      46: putfield      #21                 // Field c:[I
      49: aload_0
      50: getfield      #21                 // Field c:[I
      53: iconst_m1
      54: invokestatic  #27                 // Method java/util/Arrays.fill:([II)V
      57: goto          98
      60: iload_3
      61: aload_0
      62: getfield      #21                 // Field c:[I
      65: arraylength
      66: if_icmplt     98
      69: aload_0
      70: getfield      #21                 // Field c:[I
      73: astore        4
      75: aload_0
      76: iload_3
      77: iconst_2
      78: imul
      79: newarray       int
      81: putfield      #21                 // Field c:[I
      84: aload         4
      86: iconst_0
      87: aload_0
      88: getfield      #21                 // Field c:[I
      91: iconst_0
      92: aload         4
      94: arraylength
      95: invokestatic  #107                // Method java/lang/System.arraycopy:(Ljava/lang/Object;ILjava/lang/Object;II)V
      98: aload_0
      99: getfield      #21                 // Field c:[I
     102: iload_3
     103: iload_1
     104: iastore
     105: aload_0
     106: getfield      #21                 // Field c:[I
     109: iload_3
     110: iconst_1
     111: iadd
     112: iload_2
     113: iastore
     114: aload_0
     115: aload_0
     116: getfield      #29                 // Field d:I
     119: iconst_1
     120: iadd
     121: putfield      #29                 // Field d:I
     124: return
}
