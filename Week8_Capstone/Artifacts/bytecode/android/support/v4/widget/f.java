public final class android.support.v4.widget.f<T> {
  public android.support.v4.widget.f();
    Code:
       0: aload_0
       1: invokespecial #21                 // Method java/lang/Object."<init>":()V
       4: aload_0
       5: new           #23                 // class android/support/v4/g/k$b
       8: dup
       9: bipush        10
      11: invokespecial #26                 // Method android/support/v4/g/k$b."<init>":(I)V
      14: putfield      #28                 // Field a:Landroid/support/v4/g/k$a;
      17: aload_0
      18: new           #30                 // class android/support/v4/g/m
      21: dup
      22: invokespecial #31                 // Method android/support/v4/g/m."<init>":()V
      25: putfield      #33                 // Field b:Landroid/support/v4/g/m;
      28: aload_0
      29: new           #35                 // class java/util/ArrayList
      32: dup
      33: invokespecial #36                 // Method java/util/ArrayList."<init>":()V
      36: putfield      #38                 // Field c:Ljava/util/ArrayList;
      39: aload_0
      40: new           #40                 // class java/util/HashSet
      43: dup
      44: invokespecial #41                 // Method java/util/HashSet."<init>":()V
      47: putfield      #43                 // Field d:Ljava/util/HashSet;
      50: return

  public void a();
    Code:
       0: aload_0
       1: getfield      #33                 // Field b:Landroid/support/v4/g/m;
       4: invokevirtual #94                 // Method android/support/v4/g/m.size:()I
       7: istore_2
       8: iconst_0
       9: istore_1
      10: iload_1
      11: iload_2
      12: if_icmpge     43
      15: aload_0
      16: getfield      #33                 // Field b:Landroid/support/v4/g/m;
      19: iload_1
      20: invokevirtual #96                 // Method android/support/v4/g/m.c:(I)Ljava/lang/Object;
      23: checkcast     #35                 // class java/util/ArrayList
      26: astore_3
      27: aload_3
      28: ifnull        36
      31: aload_0
      32: aload_3
      33: invokespecial #98                 // Method a:(Ljava/util/ArrayList;)V
      36: iload_1
      37: iconst_1
      38: iadd
      39: istore_1
      40: goto          10
      43: aload_0
      44: getfield      #33                 // Field b:Landroid/support/v4/g/m;
      47: invokevirtual #99                 // Method android/support/v4/g/m.clear:()V
      50: return

  public void a(T);
    Code:
       0: aload_0
       1: getfield      #33                 // Field b:Landroid/support/v4/g/m;
       4: aload_1
       5: invokevirtual #103                // Method android/support/v4/g/m.containsKey:(Ljava/lang/Object;)Z
       8: ifne          21
      11: aload_0
      12: getfield      #33                 // Field b:Landroid/support/v4/g/m;
      15: aload_1
      16: aconst_null
      17: invokevirtual #107                // Method android/support/v4/g/m.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      20: pop
      21: return

  public void a(T, T);
    Code:
       0: aload_0
       1: getfield      #33                 // Field b:Landroid/support/v4/g/m;
       4: aload_1
       5: invokevirtual #103                // Method android/support/v4/g/m.containsKey:(Ljava/lang/Object;)Z
       8: ifeq          68
      11: aload_0
      12: getfield      #33                 // Field b:Landroid/support/v4/g/m;
      15: aload_2
      16: invokevirtual #103                // Method android/support/v4/g/m.containsKey:(Ljava/lang/Object;)Z
      19: ifne          25
      22: goto          68
      25: aload_0
      26: getfield      #33                 // Field b:Landroid/support/v4/g/m;
      29: aload_1
      30: invokevirtual #64                 // Method android/support/v4/g/m.get:(Ljava/lang/Object;)Ljava/lang/Object;
      33: checkcast     #35                 // class java/util/ArrayList
      36: astore        4
      38: aload         4
      40: astore_3
      41: aload         4
      43: ifnonnull     61
      46: aload_0
      47: invokespecial #111                // Method c:()Ljava/util/ArrayList;
      50: astore_3
      51: aload_0
      52: getfield      #33                 // Field b:Landroid/support/v4/g/m;
      55: aload_1
      56: aload_3
      57: invokevirtual #107                // Method android/support/v4/g/m.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      60: pop
      61: aload_3
      62: aload_2
      63: invokevirtual #77                 // Method java/util/ArrayList.add:(Ljava/lang/Object;)Z
      66: pop
      67: return
      68: new           #113                // class java/lang/IllegalArgumentException
      71: dup
      72: ldc           #115                // String All nodes must be present in the graph before being added as an edge
      74: invokespecial #116                // Method java/lang/IllegalArgumentException."<init>":(Ljava/lang/String;)V
      77: athrow

  public java.util.ArrayList<T> b();
    Code:
       0: aload_0
       1: getfield      #38                 // Field c:Ljava/util/ArrayList;
       4: invokevirtual #83                 // Method java/util/ArrayList.clear:()V
       7: aload_0
       8: getfield      #43                 // Field d:Ljava/util/HashSet;
      11: invokevirtual #118                // Method java/util/HashSet.clear:()V
      14: aload_0
      15: getfield      #33                 // Field b:Landroid/support/v4/g/m;
      18: invokevirtual #94                 // Method android/support/v4/g/m.size:()I
      21: istore_2
      22: iconst_0
      23: istore_1
      24: iload_1
      25: iload_2
      26: if_icmpge     56
      29: aload_0
      30: aload_0
      31: getfield      #33                 // Field b:Landroid/support/v4/g/m;
      34: iload_1
      35: invokevirtual #120                // Method android/support/v4/g/m.b:(I)Ljava/lang/Object;
      38: aload_0
      39: getfield      #38                 // Field c:Ljava/util/ArrayList;
      42: aload_0
      43: getfield      #43                 // Field d:Ljava/util/HashSet;
      46: invokespecial #73                 // Method a:(Ljava/lang/Object;Ljava/util/ArrayList;Ljava/util/HashSet;)V
      49: iload_1
      50: iconst_1
      51: iadd
      52: istore_1
      53: goto          24
      56: aload_0
      57: getfield      #38                 // Field c:Ljava/util/ArrayList;
      60: areturn

  public boolean b(T);
    Code:
       0: aload_0
       1: getfield      #33                 // Field b:Landroid/support/v4/g/m;
       4: aload_1
       5: invokevirtual #103                // Method android/support/v4/g/m.containsKey:(Ljava/lang/Object;)Z
       8: ireturn

  public java.util.List c(T);
    Code:
       0: aload_0
       1: getfield      #33                 // Field b:Landroid/support/v4/g/m;
       4: aload_1
       5: invokevirtual #64                 // Method android/support/v4/g/m.get:(Ljava/lang/Object;)Ljava/lang/Object;
       8: checkcast     #124                // class java/util/List
      11: areturn

  public java.util.List<T> d(T);
    Code:
       0: aload_0
       1: getfield      #33                 // Field b:Landroid/support/v4/g/m;
       4: invokevirtual #94                 // Method android/support/v4/g/m.size:()I
       7: istore_3
       8: aconst_null
       9: astore        4
      11: iconst_0
      12: istore_2
      13: iload_2
      14: iload_3
      15: if_icmpge     96
      18: aload_0
      19: getfield      #33                 // Field b:Landroid/support/v4/g/m;
      22: iload_2
      23: invokevirtual #96                 // Method android/support/v4/g/m.c:(I)Ljava/lang/Object;
      26: checkcast     #35                 // class java/util/ArrayList
      29: astore        6
      31: aload         4
      33: astore        5
      35: aload         6
      37: ifnull        85
      40: aload         4
      42: astore        5
      44: aload         6
      46: aload_1
      47: invokevirtual #49                 // Method java/util/ArrayList.contains:(Ljava/lang/Object;)Z
      50: ifeq          85
      53: aload         4
      55: astore        5
      57: aload         4
      59: ifnonnull     71
      62: new           #35                 // class java/util/ArrayList
      65: dup
      66: invokespecial #36                 // Method java/util/ArrayList."<init>":()V
      69: astore        5
      71: aload         5
      73: aload_0
      74: getfield      #33                 // Field b:Landroid/support/v4/g/m;
      77: iload_2
      78: invokevirtual #120                // Method android/support/v4/g/m.b:(I)Ljava/lang/Object;
      81: invokevirtual #77                 // Method java/util/ArrayList.add:(Ljava/lang/Object;)Z
      84: pop
      85: iload_2
      86: iconst_1
      87: iadd
      88: istore_2
      89: aload         5
      91: astore        4
      93: goto          13
      96: aload         4
      98: areturn

  public boolean e(T);
    Code:
       0: aload_0
       1: getfield      #33                 // Field b:Landroid/support/v4/g/m;
       4: invokevirtual #94                 // Method android/support/v4/g/m.size:()I
       7: istore_3
       8: iconst_0
       9: istore_2
      10: iload_2
      11: iload_3
      12: if_icmpge     51
      15: aload_0
      16: getfield      #33                 // Field b:Landroid/support/v4/g/m;
      19: iload_2
      20: invokevirtual #96                 // Method android/support/v4/g/m.c:(I)Ljava/lang/Object;
      23: checkcast     #35                 // class java/util/ArrayList
      26: astore        4
      28: aload         4
      30: ifnull        44
      33: aload         4
      35: aload_1
      36: invokevirtual #49                 // Method java/util/ArrayList.contains:(Ljava/lang/Object;)Z
      39: ifeq          44
      42: iconst_1
      43: ireturn
      44: iload_2
      45: iconst_1
      46: iadd
      47: istore_2
      48: goto          10
      51: iconst_0
      52: ireturn
}
