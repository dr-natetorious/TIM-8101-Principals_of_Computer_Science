class android.support.v7.widget.aj {
  final android.support.v7.widget.aj$b a;

  final android.support.v7.widget.aj$a b;

  final java.util.List<android.view.View> c;

  android.support.v7.widget.aj(android.support.v7.widget.aj$b);
    Code:
       0: aload_0
       1: invokespecial #20                 // Method java/lang/Object."<init>":()V
       4: aload_0
       5: aload_1
       6: putfield      #22                 // Field a:Landroid/support/v7/widget/aj$b;
       9: aload_0
      10: new           #6                  // class android/support/v7/widget/aj$a
      13: dup
      14: invokespecial #23                 // Method android/support/v7/widget/aj$a."<init>":()V
      17: putfield      #25                 // Field b:Landroid/support/v7/widget/aj$a;
      20: aload_0
      21: new           #27                 // class java/util/ArrayList
      24: dup
      25: invokespecial #28                 // Method java/util/ArrayList."<init>":()V
      28: putfield      #30                 // Field c:Ljava/util/List;
      31: return

  void a();
    Code:
       0: aload_0
       1: getfield      #25                 // Field b:Landroid/support/v7/widget/aj$a;
       4: invokevirtual #62                 // Method android/support/v7/widget/aj$a.a:()V
       7: aload_0
       8: getfield      #30                 // Field c:Ljava/util/List;
      11: invokeinterface #65,  1           // InterfaceMethod java/util/List.size:()I
      16: iconst_1
      17: isub
      18: istore_1
      19: iload_1
      20: iflt          63
      23: aload_0
      24: getfield      #22                 // Field a:Landroid/support/v7/widget/aj$b;
      27: aload_0
      28: getfield      #30                 // Field c:Ljava/util/List;
      31: iload_1
      32: invokeinterface #69,  2           // InterfaceMethod java/util/List.get:(I)Ljava/lang/Object;
      37: checkcast     #71                 // class android/view/View
      40: invokeinterface #60,  2           // InterfaceMethod android/support/v7/widget/aj$b.d:(Landroid/view/View;)V
      45: aload_0
      46: getfield      #30                 // Field c:Ljava/util/List;
      49: iload_1
      50: invokeinterface #73,  2           // InterfaceMethod java/util/List.remove:(I)Ljava/lang/Object;
      55: pop
      56: iload_1
      57: iconst_1
      58: isub
      59: istore_1
      60: goto          19
      63: aload_0
      64: getfield      #22                 // Field a:Landroid/support/v7/widget/aj$b;
      67: invokeinterface #75,  1           // InterfaceMethod android/support/v7/widget/aj$b.b:()V
      72: return

  void a(int);
    Code:
       0: aload_0
       1: iload_1
       2: invokespecial #78                 // Method f:(I)I
       5: istore_1
       6: aload_0
       7: getfield      #22                 // Field a:Landroid/support/v7/widget/aj$b;
      10: iload_1
      11: invokeinterface #81,  2           // InterfaceMethod android/support/v7/widget/aj$b.b:(I)Landroid/view/View;
      16: astore_2
      17: aload_2
      18: ifnonnull     22
      21: return
      22: aload_0
      23: getfield      #25                 // Field b:Landroid/support/v7/widget/aj$a;
      26: iload_1
      27: invokevirtual #83                 // Method android/support/v7/widget/aj$a.d:(I)Z
      30: ifeq          39
      33: aload_0
      34: aload_2
      35: invokespecial #85                 // Method h:(Landroid/view/View;)Z
      38: pop
      39: aload_0
      40: getfield      #22                 // Field a:Landroid/support/v7/widget/aj$b;
      43: iload_1
      44: invokeinterface #87,  2           // InterfaceMethod android/support/v7/widget/aj$b.a:(I)V
      49: return

  void a(android.view.View);
    Code:
       0: aload_0
       1: getfield      #22                 // Field a:Landroid/support/v7/widget/aj$b;
       4: aload_1
       5: invokeinterface #90,  2           // InterfaceMethod android/support/v7/widget/aj$b.a:(Landroid/view/View;)I
      10: istore_2
      11: iload_2
      12: ifge          16
      15: return
      16: aload_0
      17: getfield      #25                 // Field b:Landroid/support/v7/widget/aj$a;
      20: iload_2
      21: invokevirtual #83                 // Method android/support/v7/widget/aj$a.d:(I)Z
      24: ifeq          33
      27: aload_0
      28: aload_1
      29: invokespecial #85                 // Method h:(Landroid/view/View;)Z
      32: pop
      33: aload_0
      34: getfield      #22                 // Field a:Landroid/support/v7/widget/aj$b;
      37: iload_2
      38: invokeinterface #87,  2           // InterfaceMethod android/support/v7/widget/aj$b.a:(I)V
      43: return

  void a(android.view.View, int, android.view.ViewGroup$LayoutParams, boolean);
    Code:
       0: iload_2
       1: ifge          17
       4: aload_0
       5: getfield      #22                 // Field a:Landroid/support/v7/widget/aj$b;
       8: invokeinterface #36,  1           // InterfaceMethod android/support/v7/widget/aj$b.a:()I
      13: istore_2
      14: goto          23
      17: aload_0
      18: iload_2
      19: invokespecial #78                 // Method f:(I)I
      22: istore_2
      23: aload_0
      24: getfield      #25                 // Field b:Landroid/support/v7/widget/aj$a;
      27: iload_2
      28: iload         4
      30: invokevirtual #94                 // Method android/support/v7/widget/aj$a.a:(IZ)V
      33: iload         4
      35: ifeq          43
      38: aload_0
      39: aload_1
      40: invokespecial #96                 // Method g:(Landroid/view/View;)V
      43: aload_0
      44: getfield      #22                 // Field a:Landroid/support/v7/widget/aj$b;
      47: aload_1
      48: iload_2
      49: aload_3
      50: invokeinterface #99,  4           // InterfaceMethod android/support/v7/widget/aj$b.a:(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V
      55: return

  void a(android.view.View, int, boolean);
    Code:
       0: iload_2
       1: ifge          17
       4: aload_0
       5: getfield      #22                 // Field a:Landroid/support/v7/widget/aj$b;
       8: invokeinterface #36,  1           // InterfaceMethod android/support/v7/widget/aj$b.a:()I
      13: istore_2
      14: goto          23
      17: aload_0
      18: iload_2
      19: invokespecial #78                 // Method f:(I)I
      22: istore_2
      23: aload_0
      24: getfield      #25                 // Field b:Landroid/support/v7/widget/aj$a;
      27: iload_2
      28: iload_3
      29: invokevirtual #94                 // Method android/support/v7/widget/aj$a.a:(IZ)V
      32: iload_3
      33: ifeq          41
      36: aload_0
      37: aload_1
      38: invokespecial #96                 // Method g:(Landroid/view/View;)V
      41: aload_0
      42: getfield      #22                 // Field a:Landroid/support/v7/widget/aj$b;
      45: aload_1
      46: iload_2
      47: invokeinterface #103,  3          // InterfaceMethod android/support/v7/widget/aj$b.a:(Landroid/view/View;I)V
      52: return

  void a(android.view.View, boolean);
    Code:
       0: aload_0
       1: aload_1
       2: iconst_m1
       3: iload_2
       4: invokevirtual #106                // Method a:(Landroid/view/View;IZ)V
       7: return

  int b();
    Code:
       0: aload_0
       1: getfield      #22                 // Field a:Landroid/support/v7/widget/aj$b;
       4: invokeinterface #36,  1           // InterfaceMethod android/support/v7/widget/aj$b.a:()I
       9: aload_0
      10: getfield      #30                 // Field c:Ljava/util/List;
      13: invokeinterface #65,  1           // InterfaceMethod java/util/List.size:()I
      18: isub
      19: ireturn

  int b(android.view.View);
    Code:
       0: aload_0
       1: getfield      #22                 // Field a:Landroid/support/v7/widget/aj$b;
       4: aload_1
       5: invokeinterface #90,  2           // InterfaceMethod android/support/v7/widget/aj$b.a:(Landroid/view/View;)I
      10: istore_2
      11: iload_2
      12: iconst_m1
      13: if_icmpne     18
      16: iconst_m1
      17: ireturn
      18: aload_0
      19: getfield      #25                 // Field b:Landroid/support/v7/widget/aj$a;
      22: iload_2
      23: invokevirtual #42                 // Method android/support/v7/widget/aj$a.c:(I)Z
      26: ifeq          31
      29: iconst_m1
      30: ireturn
      31: iload_2
      32: aload_0
      33: getfield      #25                 // Field b:Landroid/support/v7/widget/aj$a;
      36: iload_2
      37: invokevirtual #39                 // Method android/support/v7/widget/aj$a.e:(I)I
      40: isub
      41: ireturn

  android.view.View b(int);
    Code:
       0: aload_0
       1: iload_1
       2: invokespecial #78                 // Method f:(I)I
       5: istore_1
       6: aload_0
       7: getfield      #22                 // Field a:Landroid/support/v7/widget/aj$b;
      10: iload_1
      11: invokeinterface #81,  2           // InterfaceMethod android/support/v7/widget/aj$b.b:(I)Landroid/view/View;
      16: areturn

  int c();
    Code:
       0: aload_0
       1: getfield      #22                 // Field a:Landroid/support/v7/widget/aj$b;
       4: invokeinterface #36,  1           // InterfaceMethod android/support/v7/widget/aj$b.a:()I
       9: ireturn

  android.view.View c(int);
    Code:
       0: aload_0
       1: getfield      #30                 // Field c:Ljava/util/List;
       4: invokeinterface #65,  1           // InterfaceMethod java/util/List.size:()I
       9: istore_3
      10: iconst_0
      11: istore_2
      12: iload_2
      13: iload_3
      14: if_icmpge     80
      17: aload_0
      18: getfield      #30                 // Field c:Ljava/util/List;
      21: iload_2
      22: invokeinterface #69,  2           // InterfaceMethod java/util/List.get:(I)Ljava/lang/Object;
      27: checkcast     #71                 // class android/view/View
      30: astore        4
      32: aload_0
      33: getfield      #22                 // Field a:Landroid/support/v7/widget/aj$b;
      36: aload         4
      38: invokeinterface #109,  2          // InterfaceMethod android/support/v7/widget/aj$b.b:(Landroid/view/View;)Landroid/support/v7/widget/RecyclerView$x;
      43: astore        5
      45: aload         5
      47: invokevirtual #113                // Method android/support/v7/widget/RecyclerView$x.d:()I
      50: iload_1
      51: if_icmpne     73
      54: aload         5
      56: invokevirtual #117                // Method android/support/v7/widget/RecyclerView$x.n:()Z
      59: ifne          73
      62: aload         5
      64: invokevirtual #120                // Method android/support/v7/widget/RecyclerView$x.q:()Z
      67: ifne          73
      70: aload         4
      72: areturn
      73: iload_2
      74: iconst_1
      75: iadd
      76: istore_2
      77: goto          12
      80: aconst_null
      81: areturn

  boolean c(android.view.View);
    Code:
       0: aload_0
       1: getfield      #30                 // Field c:Ljava/util/List;
       4: aload_1
       5: invokeinterface #123,  2          // InterfaceMethod java/util/List.contains:(Ljava/lang/Object;)Z
      10: ireturn

  android.view.View d(int);
    Code:
       0: aload_0
       1: getfield      #22                 // Field a:Landroid/support/v7/widget/aj$b;
       4: iload_1
       5: invokeinterface #81,  2           // InterfaceMethod android/support/v7/widget/aj$b.b:(I)Landroid/view/View;
      10: areturn

  void d(android.view.View);
    Code:
       0: aload_0
       1: getfield      #22                 // Field a:Landroid/support/v7/widget/aj$b;
       4: aload_1
       5: invokeinterface #90,  2           // InterfaceMethod android/support/v7/widget/aj$b.a:(Landroid/view/View;)I
      10: istore_2
      11: iload_2
      12: ifge          48
      15: new           #125                // class java/lang/StringBuilder
      18: dup
      19: invokespecial #126                // Method java/lang/StringBuilder."<init>":()V
      22: astore_3
      23: aload_3
      24: ldc           #128                // String view is not a child, cannot hide
      26: invokevirtual #132                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      29: pop
      30: aload_3
      31: aload_1
      32: invokevirtual #135                // Method java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
      35: pop
      36: new           #137                // class java/lang/IllegalArgumentException
      39: dup
      40: aload_3
      41: invokevirtual #141                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
      44: invokespecial #144                // Method java/lang/IllegalArgumentException."<init>":(Ljava/lang/String;)V
      47: athrow
      48: aload_0
      49: getfield      #25                 // Field b:Landroid/support/v7/widget/aj$a;
      52: iload_2
      53: invokevirtual #145                // Method android/support/v7/widget/aj$a.a:(I)V
      56: aload_0
      57: aload_1
      58: invokespecial #96                 // Method g:(Landroid/view/View;)V
      61: return

  void e(int);
    Code:
       0: aload_0
       1: iload_1
       2: invokespecial #78                 // Method f:(I)I
       5: istore_1
       6: aload_0
       7: getfield      #25                 // Field b:Landroid/support/v7/widget/aj$a;
      10: iload_1
      11: invokevirtual #83                 // Method android/support/v7/widget/aj$a.d:(I)Z
      14: pop
      15: aload_0
      16: getfield      #22                 // Field a:Landroid/support/v7/widget/aj$b;
      19: iload_1
      20: invokeinterface #147,  2          // InterfaceMethod android/support/v7/widget/aj$b.c:(I)V
      25: return

  void e(android.view.View);
    Code:
       0: aload_0
       1: getfield      #22                 // Field a:Landroid/support/v7/widget/aj$b;
       4: aload_1
       5: invokeinterface #90,  2           // InterfaceMethod android/support/v7/widget/aj$b.a:(Landroid/view/View;)I
      10: istore_2
      11: iload_2
      12: ifge          48
      15: new           #125                // class java/lang/StringBuilder
      18: dup
      19: invokespecial #126                // Method java/lang/StringBuilder."<init>":()V
      22: astore_3
      23: aload_3
      24: ldc           #128                // String view is not a child, cannot hide
      26: invokevirtual #132                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      29: pop
      30: aload_3
      31: aload_1
      32: invokevirtual #135                // Method java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
      35: pop
      36: new           #137                // class java/lang/IllegalArgumentException
      39: dup
      40: aload_3
      41: invokevirtual #141                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
      44: invokespecial #144                // Method java/lang/IllegalArgumentException."<init>":(Ljava/lang/String;)V
      47: athrow
      48: aload_0
      49: getfield      #25                 // Field b:Landroid/support/v7/widget/aj$a;
      52: iload_2
      53: invokevirtual #42                 // Method android/support/v7/widget/aj$a.c:(I)Z
      56: ifne          92
      59: new           #125                // class java/lang/StringBuilder
      62: dup
      63: invokespecial #126                // Method java/lang/StringBuilder."<init>":()V
      66: astore_3
      67: aload_3
      68: ldc           #149                // String trying to unhide a view that was not hidden
      70: invokevirtual #132                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      73: pop
      74: aload_3
      75: aload_1
      76: invokevirtual #135                // Method java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
      79: pop
      80: new           #151                // class java/lang/RuntimeException
      83: dup
      84: aload_3
      85: invokevirtual #141                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
      88: invokespecial #152                // Method java/lang/RuntimeException."<init>":(Ljava/lang/String;)V
      91: athrow
      92: aload_0
      93: getfield      #25                 // Field b:Landroid/support/v7/widget/aj$a;
      96: iload_2
      97: invokevirtual #154                // Method android/support/v7/widget/aj$a.b:(I)V
     100: aload_0
     101: aload_1
     102: invokespecial #85                 // Method h:(Landroid/view/View;)Z
     105: pop
     106: return

  boolean f(android.view.View);
    Code:
       0: aload_0
       1: getfield      #22                 // Field a:Landroid/support/v7/widget/aj$b;
       4: aload_1
       5: invokeinterface #90,  2           // InterfaceMethod android/support/v7/widget/aj$b.a:(Landroid/view/View;)I
      10: istore_2
      11: iload_2
      12: iconst_m1
      13: if_icmpne     24
      16: aload_0
      17: aload_1
      18: invokespecial #85                 // Method h:(Landroid/view/View;)Z
      21: pop
      22: iconst_1
      23: ireturn
      24: aload_0
      25: getfield      #25                 // Field b:Landroid/support/v7/widget/aj$a;
      28: iload_2
      29: invokevirtual #42                 // Method android/support/v7/widget/aj$a.c:(I)Z
      32: ifeq          62
      35: aload_0
      36: getfield      #25                 // Field b:Landroid/support/v7/widget/aj$a;
      39: iload_2
      40: invokevirtual #83                 // Method android/support/v7/widget/aj$a.d:(I)Z
      43: pop
      44: aload_0
      45: aload_1
      46: invokespecial #85                 // Method h:(Landroid/view/View;)Z
      49: pop
      50: aload_0
      51: getfield      #22                 // Field a:Landroid/support/v7/widget/aj$b;
      54: iload_2
      55: invokeinterface #87,  2           // InterfaceMethod android/support/v7/widget/aj$b.a:(I)V
      60: iconst_1
      61: ireturn
      62: iconst_0
      63: ireturn

  public java.lang.String toString();
    Code:
       0: new           #125                // class java/lang/StringBuilder
       3: dup
       4: invokespecial #126                // Method java/lang/StringBuilder."<init>":()V
       7: astore_1
       8: aload_1
       9: aload_0
      10: getfield      #25                 // Field b:Landroid/support/v7/widget/aj$a;
      13: invokevirtual #155                // Method android/support/v7/widget/aj$a.toString:()Ljava/lang/String;
      16: invokevirtual #132                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      19: pop
      20: aload_1
      21: ldc           #157                // String , hidden list:
      23: invokevirtual #132                // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      26: pop
      27: aload_1
      28: aload_0
      29: getfield      #30                 // Field c:Ljava/util/List;
      32: invokeinterface #65,  1           // InterfaceMethod java/util/List.size:()I
      37: invokevirtual #160                // Method java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
      40: pop
      41: aload_1
      42: invokevirtual #141                // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
      45: areturn
}
