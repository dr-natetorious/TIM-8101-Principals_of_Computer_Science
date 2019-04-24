class android.support.v7.widget.StaggeredGridLayoutManager$a {
  int a;

  int b;

  boolean c;

  boolean d;

  boolean e;

  int[] f;

  final android.support.v7.widget.StaggeredGridLayoutManager g;

  android.support.v7.widget.StaggeredGridLayoutManager$a(android.support.v7.widget.StaggeredGridLayoutManager);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #21                 // Field g:Landroid/support/v7/widget/StaggeredGridLayoutManager;
       5: aload_0
       6: invokespecial #24                 // Method java/lang/Object."<init>":()V
       9: aload_0
      10: invokevirtual #26                 // Method a:()V
      13: return

  void a();
    Code:
       0: aload_0
       1: iconst_m1
       2: putfield      #29                 // Field a:I
       5: aload_0
       6: ldc           #30                 // int -2147483648
       8: putfield      #32                 // Field b:I
      11: aload_0
      12: iconst_0
      13: putfield      #34                 // Field c:Z
      16: aload_0
      17: iconst_0
      18: putfield      #36                 // Field d:Z
      21: aload_0
      22: iconst_0
      23: putfield      #38                 // Field e:Z
      26: aload_0
      27: getfield      #40                 // Field f:[I
      30: ifnull        41
      33: aload_0
      34: getfield      #40                 // Field f:[I
      37: iconst_m1
      38: invokestatic  #46                 // Method java/util/Arrays.fill:([II)V
      41: return

  void a(int);
    Code:
       0: aload_0
       1: getfield      #34                 // Field c:Z
       4: ifeq          26
       7: aload_0
       8: getfield      #21                 // Field g:Landroid/support/v7/widget/StaggeredGridLayoutManager;
      11: getfield      #50                 // Field android/support/v7/widget/StaggeredGridLayoutManager.b:Landroid/support/v7/widget/ba;
      14: invokevirtual #55                 // Method android/support/v7/widget/ba.d:()I
      17: iload_1
      18: isub
      19: istore_1
      20: aload_0
      21: iload_1
      22: putfield      #32                 // Field b:I
      25: return
      26: aload_0
      27: getfield      #21                 // Field g:Landroid/support/v7/widget/StaggeredGridLayoutManager;
      30: getfield      #50                 // Field android/support/v7/widget/StaggeredGridLayoutManager.b:Landroid/support/v7/widget/ba;
      33: invokevirtual #57                 // Method android/support/v7/widget/ba.c:()I
      36: iload_1
      37: iadd
      38: istore_1
      39: goto          20

  void a(android.support.v7.widget.StaggeredGridLayoutManager$e[]);
    Code:
       0: aload_1
       1: arraylength
       2: istore_3
       3: aload_0
       4: getfield      #40                 // Field f:[I
       7: ifnull        19
      10: aload_0
      11: getfield      #40                 // Field f:[I
      14: arraylength
      15: iload_3
      16: if_icmpge     33
      19: aload_0
      20: aload_0
      21: getfield      #21                 // Field g:Landroid/support/v7/widget/StaggeredGridLayoutManager;
      24: getfield      #61                 // Field android/support/v7/widget/StaggeredGridLayoutManager.a:[Landroid/support/v7/widget/StaggeredGridLayoutManager$e;
      27: arraylength
      28: newarray       int
      30: putfield      #40                 // Field f:[I
      33: iconst_0
      34: istore_2
      35: iload_2
      36: iload_3
      37: if_icmpge     61
      40: aload_0
      41: getfield      #40                 // Field f:[I
      44: iload_2
      45: aload_1
      46: iload_2
      47: aaload
      48: ldc           #30                 // int -2147483648
      50: invokevirtual #66                 // Method android/support/v7/widget/StaggeredGridLayoutManager$e.a:(I)I
      53: iastore
      54: iload_2
      55: iconst_1
      56: iadd
      57: istore_2
      58: goto          35
      61: return

  void b();
    Code:
       0: aload_0
       1: getfield      #34                 // Field c:Z
       4: ifeq          21
       7: aload_0
       8: getfield      #21                 // Field g:Landroid/support/v7/widget/StaggeredGridLayoutManager;
      11: getfield      #50                 // Field android/support/v7/widget/StaggeredGridLayoutManager.b:Landroid/support/v7/widget/ba;
      14: invokevirtual #55                 // Method android/support/v7/widget/ba.d:()I
      17: istore_1
      18: goto          32
      21: aload_0
      22: getfield      #21                 // Field g:Landroid/support/v7/widget/StaggeredGridLayoutManager;
      25: getfield      #50                 // Field android/support/v7/widget/StaggeredGridLayoutManager.b:Landroid/support/v7/widget/ba;
      28: invokevirtual #57                 // Method android/support/v7/widget/ba.c:()I
      31: istore_1
      32: aload_0
      33: iload_1
      34: putfield      #32                 // Field b:I
      37: return
}
