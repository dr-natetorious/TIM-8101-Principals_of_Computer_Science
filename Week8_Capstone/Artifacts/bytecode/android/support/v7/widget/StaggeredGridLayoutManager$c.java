class android.support.v7.widget.StaggeredGridLayoutManager$c {
  int[] a;

  java.util.List<android.support.v7.widget.StaggeredGridLayoutManager$c$a> b;

  android.support.v7.widget.StaggeredGridLayoutManager$c();
    Code:
       0: aload_0
       1: invokespecial #20                 // Method java/lang/Object."<init>":()V
       4: return

  int a(int);
    Code:
       0: aload_0
       1: getfield      #24                 // Field b:Ljava/util/List;
       4: ifnull        61
       7: aload_0
       8: getfield      #24                 // Field b:Ljava/util/List;
      11: invokeinterface #30,  1           // InterfaceMethod java/util/List.size:()I
      16: iconst_1
      17: isub
      18: istore_2
      19: iload_2
      20: iflt          61
      23: aload_0
      24: getfield      #24                 // Field b:Ljava/util/List;
      27: iload_2
      28: invokeinterface #34,  2           // InterfaceMethod java/util/List.get:(I)Ljava/lang/Object;
      33: checkcast     #9                  // class android/support/v7/widget/StaggeredGridLayoutManager$c$a
      36: getfield      #37                 // Field android/support/v7/widget/StaggeredGridLayoutManager$c$a.a:I
      39: iload_1
      40: if_icmplt     54
      43: aload_0
      44: getfield      #24                 // Field b:Ljava/util/List;
      47: iload_2
      48: invokeinterface #40,  2           // InterfaceMethod java/util/List.remove:(I)Ljava/lang/Object;
      53: pop
      54: iload_2
      55: iconst_1
      56: isub
      57: istore_2
      58: goto          19
      61: aload_0
      62: iload_1
      63: invokevirtual #52                 // Method b:(I)I
      66: ireturn

  public android.support.v7.widget.StaggeredGridLayoutManager$c$a a(int, int, int, boolean);
    Code:
       0: aload_0
       1: getfield      #24                 // Field b:Ljava/util/List;
       4: ifnonnull     9
       7: aconst_null
       8: areturn
       9: aload_0
      10: getfield      #24                 // Field b:Ljava/util/List;
      13: invokeinterface #30,  1           // InterfaceMethod java/util/List.size:()I
      18: istore        6
      20: iconst_0
      21: istore        5
      23: iload         5
      25: iload         6
      27: if_icmpge     104
      30: aload_0
      31: getfield      #24                 // Field b:Ljava/util/List;
      34: iload         5
      36: invokeinterface #34,  2           // InterfaceMethod java/util/List.get:(I)Ljava/lang/Object;
      41: checkcast     #9                  // class android/support/v7/widget/StaggeredGridLayoutManager$c$a
      44: astore        7
      46: aload         7
      48: getfield      #37                 // Field android/support/v7/widget/StaggeredGridLayoutManager$c$a.a:I
      51: iload_2
      52: if_icmplt     57
      55: aconst_null
      56: areturn
      57: aload         7
      59: getfield      #37                 // Field android/support/v7/widget/StaggeredGridLayoutManager$c$a.a:I
      62: iload_1
      63: if_icmplt     95
      66: iload_3
      67: ifeq          92
      70: aload         7
      72: getfield      #55                 // Field android/support/v7/widget/StaggeredGridLayoutManager$c$a.b:I
      75: iload_3
      76: if_icmpeq     92
      79: iload         4
      81: ifeq          95
      84: aload         7
      86: getfield      #58                 // Field android/support/v7/widget/StaggeredGridLayoutManager$c$a.d:Z
      89: ifeq          95
      92: aload         7
      94: areturn
      95: iload         5
      97: iconst_1
      98: iadd
      99: istore        5
     101: goto          23
     104: aconst_null
     105: areturn

  void a();
    Code:
       0: aload_0
       1: getfield      #60                 // Field a:[I
       4: ifnull        15
       7: aload_0
       8: getfield      #60                 // Field a:[I
      11: iconst_m1
      12: invokestatic  #66                 // Method java/util/Arrays.fill:([II)V
      15: aload_0
      16: aconst_null
      17: putfield      #24                 // Field b:Ljava/util/List;
      20: return

  void a(int, int);
    Code:
       0: aload_0
       1: getfield      #60                 // Field a:[I
       4: ifnull        74
       7: iload_1
       8: aload_0
       9: getfield      #60                 // Field a:[I
      12: arraylength
      13: if_icmplt     17
      16: return
      17: iload_1
      18: iload_2
      19: iadd
      20: istore_3
      21: aload_0
      22: iload_3
      23: invokevirtual #70                 // Method e:(I)V
      26: aload_0
      27: getfield      #60                 // Field a:[I
      30: iload_3
      31: aload_0
      32: getfield      #60                 // Field a:[I
      35: iload_1
      36: aload_0
      37: getfield      #60                 // Field a:[I
      40: arraylength
      41: iload_1
      42: isub
      43: iload_2
      44: isub
      45: invokestatic  #76                 // Method java/lang/System.arraycopy:(Ljava/lang/Object;ILjava/lang/Object;II)V
      48: aload_0
      49: getfield      #60                 // Field a:[I
      52: aload_0
      53: getfield      #60                 // Field a:[I
      56: arraylength
      57: iload_2
      58: isub
      59: aload_0
      60: getfield      #60                 // Field a:[I
      63: arraylength
      64: iconst_m1
      65: invokestatic  #79                 // Method java/util/Arrays.fill:([IIII)V
      68: aload_0
      69: iload_1
      70: iload_2
      71: invokespecial #81                 // Method c:(II)V
      74: return

  void a(int, android.support.v7.widget.StaggeredGridLayoutManager$e);
    Code:
       0: aload_0
       1: iload_1
       2: invokevirtual #70                 // Method e:(I)V
       5: aload_0
       6: getfield      #60                 // Field a:[I
       9: iload_1
      10: aload_2
      11: getfield      #86                 // Field android/support/v7/widget/StaggeredGridLayoutManager$e.e:I
      14: iastore
      15: return

  public void a(android.support.v7.widget.StaggeredGridLayoutManager$c$a);
    Code:
       0: aload_0
       1: getfield      #24                 // Field b:Ljava/util/List;
       4: ifnonnull     18
       7: aload_0
       8: new           #89                 // class java/util/ArrayList
      11: dup
      12: invokespecial #90                 // Method java/util/ArrayList."<init>":()V
      15: putfield      #24                 // Field b:Ljava/util/List;
      18: aload_0
      19: getfield      #24                 // Field b:Ljava/util/List;
      22: invokeinterface #30,  1           // InterfaceMethod java/util/List.size:()I
      27: istore_3
      28: iconst_0
      29: istore_2
      30: iload_2
      31: iload_3
      32: if_icmpge     104
      35: aload_0
      36: getfield      #24                 // Field b:Ljava/util/List;
      39: iload_2
      40: invokeinterface #34,  2           // InterfaceMethod java/util/List.get:(I)Ljava/lang/Object;
      45: checkcast     #9                  // class android/support/v7/widget/StaggeredGridLayoutManager$c$a
      48: astore        4
      50: aload         4
      52: getfield      #37                 // Field android/support/v7/widget/StaggeredGridLayoutManager$c$a.a:I
      55: aload_1
      56: getfield      #37                 // Field android/support/v7/widget/StaggeredGridLayoutManager$c$a.a:I
      59: if_icmpne     73
      62: aload_0
      63: getfield      #24                 // Field b:Ljava/util/List;
      66: iload_2
      67: invokeinterface #40,  2           // InterfaceMethod java/util/List.remove:(I)Ljava/lang/Object;
      72: pop
      73: aload         4
      75: getfield      #37                 // Field android/support/v7/widget/StaggeredGridLayoutManager$c$a.a:I
      78: aload_1
      79: getfield      #37                 // Field android/support/v7/widget/StaggeredGridLayoutManager$c$a.a:I
      82: if_icmplt     97
      85: aload_0
      86: getfield      #24                 // Field b:Ljava/util/List;
      89: iload_2
      90: aload_1
      91: invokeinterface #94,  3           // InterfaceMethod java/util/List.add:(ILjava/lang/Object;)V
      96: return
      97: iload_2
      98: iconst_1
      99: iadd
     100: istore_2
     101: goto          30
     104: aload_0
     105: getfield      #24                 // Field b:Ljava/util/List;
     108: aload_1
     109: invokeinterface #96,  2           // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
     114: pop
     115: return

  int b(int);
    Code:
       0: aload_0
       1: getfield      #60                 // Field a:[I
       4: ifnonnull     9
       7: iconst_m1
       8: ireturn
       9: iload_1
      10: aload_0
      11: getfield      #60                 // Field a:[I
      14: arraylength
      15: if_icmplt     20
      18: iconst_m1
      19: ireturn
      20: aload_0
      21: iload_1
      22: invokespecial #98                 // Method g:(I)I
      25: istore_2
      26: iload_2
      27: iconst_m1
      28: if_icmpne     51
      31: aload_0
      32: getfield      #60                 // Field a:[I
      35: iload_1
      36: aload_0
      37: getfield      #60                 // Field a:[I
      40: arraylength
      41: iconst_m1
      42: invokestatic  #79                 // Method java/util/Arrays.fill:([IIII)V
      45: aload_0
      46: getfield      #60                 // Field a:[I
      49: arraylength
      50: ireturn
      51: aload_0
      52: getfield      #60                 // Field a:[I
      55: astore_3
      56: iload_2
      57: iconst_1
      58: iadd
      59: istore_2
      60: aload_3
      61: iload_1
      62: iload_2
      63: iconst_m1
      64: invokestatic  #79                 // Method java/util/Arrays.fill:([IIII)V
      67: iload_2
      68: ireturn

  void b(int, int);
    Code:
       0: aload_0
       1: getfield      #60                 // Field a:[I
       4: ifnull        64
       7: iload_1
       8: aload_0
       9: getfield      #60                 // Field a:[I
      12: arraylength
      13: if_icmplt     17
      16: return
      17: iload_1
      18: iload_2
      19: iadd
      20: istore_3
      21: aload_0
      22: iload_3
      23: invokevirtual #70                 // Method e:(I)V
      26: aload_0
      27: getfield      #60                 // Field a:[I
      30: iload_1
      31: aload_0
      32: getfield      #60                 // Field a:[I
      35: iload_3
      36: aload_0
      37: getfield      #60                 // Field a:[I
      40: arraylength
      41: iload_1
      42: isub
      43: iload_2
      44: isub
      45: invokestatic  #76                 // Method java/lang/System.arraycopy:(Ljava/lang/Object;ILjava/lang/Object;II)V
      48: aload_0
      49: getfield      #60                 // Field a:[I
      52: iload_1
      53: iload_3
      54: iconst_m1
      55: invokestatic  #79                 // Method java/util/Arrays.fill:([IIII)V
      58: aload_0
      59: iload_1
      60: iload_2
      61: invokespecial #100                // Method d:(II)V
      64: return

  int c(int);
    Code:
       0: aload_0
       1: getfield      #60                 // Field a:[I
       4: ifnull        26
       7: iload_1
       8: aload_0
       9: getfield      #60                 // Field a:[I
      12: arraylength
      13: if_icmplt     19
      16: goto          26
      19: aload_0
      20: getfield      #60                 // Field a:[I
      23: iload_1
      24: iaload
      25: ireturn
      26: iconst_m1
      27: ireturn

  int d(int);
    Code:
       0: aload_0
       1: getfield      #60                 // Field a:[I
       4: arraylength
       5: istore_2
       6: iload_2
       7: iload_1
       8: if_icmpgt     18
      11: iload_2
      12: iconst_2
      13: imul
      14: istore_2
      15: goto          6
      18: iload_2
      19: ireturn

  void e(int);
    Code:
       0: aload_0
       1: getfield      #60                 // Field a:[I
       4: ifnonnull     30
       7: aload_0
       8: iload_1
       9: bipush        10
      11: invokestatic  #106                // Method java/lang/Math.max:(II)I
      14: iconst_1
      15: iadd
      16: newarray       int
      18: putfield      #60                 // Field a:[I
      21: aload_0
      22: getfield      #60                 // Field a:[I
      25: iconst_m1
      26: invokestatic  #66                 // Method java/util/Arrays.fill:([II)V
      29: return
      30: iload_1
      31: aload_0
      32: getfield      #60                 // Field a:[I
      35: arraylength
      36: if_icmplt     82
      39: aload_0
      40: getfield      #60                 // Field a:[I
      43: astore_2
      44: aload_0
      45: aload_0
      46: iload_1
      47: invokevirtual #108                // Method d:(I)I
      50: newarray       int
      52: putfield      #60                 // Field a:[I
      55: aload_2
      56: iconst_0
      57: aload_0
      58: getfield      #60                 // Field a:[I
      61: iconst_0
      62: aload_2
      63: arraylength
      64: invokestatic  #76                 // Method java/lang/System.arraycopy:(Ljava/lang/Object;ILjava/lang/Object;II)V
      67: aload_0
      68: getfield      #60                 // Field a:[I
      71: aload_2
      72: arraylength
      73: aload_0
      74: getfield      #60                 // Field a:[I
      77: arraylength
      78: iconst_m1
      79: invokestatic  #79                 // Method java/util/Arrays.fill:([IIII)V
      82: return

  public android.support.v7.widget.StaggeredGridLayoutManager$c$a f(int);
    Code:
       0: aload_0
       1: getfield      #24                 // Field b:Ljava/util/List;
       4: ifnonnull     9
       7: aconst_null
       8: areturn
       9: aload_0
      10: getfield      #24                 // Field b:Ljava/util/List;
      13: invokeinterface #30,  1           // InterfaceMethod java/util/List.size:()I
      18: iconst_1
      19: isub
      20: istore_2
      21: iload_2
      22: iflt          56
      25: aload_0
      26: getfield      #24                 // Field b:Ljava/util/List;
      29: iload_2
      30: invokeinterface #34,  2           // InterfaceMethod java/util/List.get:(I)Ljava/lang/Object;
      35: checkcast     #9                  // class android/support/v7/widget/StaggeredGridLayoutManager$c$a
      38: astore_3
      39: aload_3
      40: getfield      #37                 // Field android/support/v7/widget/StaggeredGridLayoutManager$c$a.a:I
      43: iload_1
      44: if_icmpne     49
      47: aload_3
      48: areturn
      49: iload_2
      50: iconst_1
      51: isub
      52: istore_2
      53: goto          21
      56: aconst_null
      57: areturn
}
