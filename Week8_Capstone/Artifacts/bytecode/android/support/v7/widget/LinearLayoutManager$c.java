class android.support.v7.widget.LinearLayoutManager$c {
  boolean a;

  int b;

  int c;

  int d;

  int e;

  int f;

  int g;

  int h;

  boolean i;

  int j;

  java.util.List<android.support.v7.widget.RecyclerView$x> k;

  boolean l;

  android.support.v7.widget.LinearLayoutManager$c();
    Code:
       0: aload_0
       1: invokespecial #26                 // Method java/lang/Object."<init>":()V
       4: aload_0
       5: iconst_1
       6: putfield      #28                 // Field a:Z
       9: aload_0
      10: iconst_0
      11: putfield      #30                 // Field h:I
      14: aload_0
      15: iconst_0
      16: putfield      #32                 // Field i:Z
      19: aload_0
      20: aconst_null
      21: putfield      #34                 // Field k:Ljava/util/List;
      24: return

  android.view.View a(android.support.v7.widget.RecyclerView$p);
    Code:
       0: aload_0
       1: getfield      #34                 // Field k:Ljava/util/List;
       4: ifnull        12
       7: aload_0
       8: invokespecial #72                 // Method b:()Landroid/view/View;
      11: areturn
      12: aload_1
      13: aload_0
      14: getfield      #64                 // Field d:I
      17: invokevirtual #77                 // Method android/support/v7/widget/RecyclerView$p.c:(I)Landroid/view/View;
      20: astore_1
      21: aload_0
      22: aload_0
      23: getfield      #64                 // Field d:I
      26: aload_0
      27: getfield      #79                 // Field e:I
      30: iadd
      31: putfield      #64                 // Field d:I
      34: aload_1
      35: areturn

  public void a();
    Code:
       0: aload_0
       1: aconst_null
       2: invokevirtual #69                 // Method a:(Landroid/view/View;)V
       5: return

  public void a(android.view.View);
    Code:
       0: aload_0
       1: aload_1
       2: invokevirtual #82                 // Method b:(Landroid/view/View;)Landroid/view/View;
       5: astore_1
       6: aload_1
       7: ifnonnull     18
      10: iconst_m1
      11: istore_2
      12: aload_0
      13: iload_2
      14: putfield      #64                 // Field d:I
      17: return
      18: aload_1
      19: invokevirtual #57                 // Method android/view/View.getLayoutParams:()Landroid/view/ViewGroup$LayoutParams;
      22: checkcast     #59                 // class android/support/v7/widget/RecyclerView$j
      25: invokevirtual #66                 // Method android/support/v7/widget/RecyclerView$j.f:()I
      28: istore_2
      29: goto          12

  boolean a(android.support.v7.widget.RecyclerView$u);
    Code:
       0: aload_0
       1: getfield      #64                 // Field d:I
       4: iflt          20
       7: aload_0
       8: getfield      #64                 // Field d:I
      11: aload_1
      12: invokevirtual #87                 // Method android/support/v7/widget/RecyclerView$u.e:()I
      15: if_icmpge     20
      18: iconst_1
      19: ireturn
      20: iconst_0
      21: ireturn

  public android.view.View b(android.view.View);
    Code:
       0: aload_0
       1: getfield      #34                 // Field k:Ljava/util/List;
       4: invokeinterface #42,  1           // InterfaceMethod java/util/List.size:()I
       9: istore        6
      11: aconst_null
      12: astore        7
      14: ldc           #88                 // int 2147483647
      16: istore_3
      17: iconst_0
      18: istore_2
      19: iload_2
      20: iload         6
      22: if_icmpge     159
      25: aload_0
      26: getfield      #34                 // Field k:Ljava/util/List;
      29: iload_2
      30: invokeinterface #46,  2           // InterfaceMethod java/util/List.get:(I)Ljava/lang/Object;
      35: checkcast     #48                 // class android/support/v7/widget/RecyclerView$x
      38: getfield      #51                 // Field android/support/v7/widget/RecyclerView$x.a:Landroid/view/View;
      41: astore        9
      43: aload         9
      45: invokevirtual #57                 // Method android/view/View.getLayoutParams:()Landroid/view/ViewGroup$LayoutParams;
      48: checkcast     #59                 // class android/support/v7/widget/RecyclerView$j
      51: astore        10
      53: aload         7
      55: astore        8
      57: iload_3
      58: istore        4
      60: aload         9
      62: aload_1
      63: if_acmpeq     145
      66: aload         10
      68: invokevirtual #62                 // Method android/support/v7/widget/RecyclerView$j.d:()Z
      71: ifeq          84
      74: aload         7
      76: astore        8
      78: iload_3
      79: istore        4
      81: goto          145
      84: aload         10
      86: invokevirtual #66                 // Method android/support/v7/widget/RecyclerView$j.f:()I
      89: aload_0
      90: getfield      #64                 // Field d:I
      93: isub
      94: aload_0
      95: getfield      #79                 // Field e:I
      98: imul
      99: istore        5
     101: iload         5
     103: ifge          116
     106: aload         7
     108: astore        8
     110: iload_3
     111: istore        4
     113: goto          145
     116: aload         7
     118: astore        8
     120: iload_3
     121: istore        4
     123: iload         5
     125: iload_3
     126: if_icmpge     145
     129: iload         5
     131: ifne          137
     134: aload         9
     136: areturn
     137: aload         9
     139: astore        8
     141: iload         5
     143: istore        4
     145: iload_2
     146: iconst_1
     147: iadd
     148: istore_2
     149: aload         8
     151: astore        7
     153: iload         4
     155: istore_3
     156: goto          19
     159: aload         7
     161: areturn
}
