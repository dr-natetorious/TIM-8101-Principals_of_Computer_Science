public class b.a.a.c extends android.support.v7.widget.RecyclerView$a<android.support.v7.widget.RecyclerView$x> {
  public b.a.a.c(java.util.List<b.a.a.b>, java.util.List<? extends b.a.a.d>);
    Code:
       0: aload_0
       1: invokespecial #25                 // Method android/support/v7/widget/RecyclerView$a."<init>":()V
       4: aload_0
       5: bipush        30
       7: putfield      #27                 // Field c:I
      10: aload_0
      11: new           #29                 // class java/util/ArrayList
      14: dup
      15: invokespecial #30                 // Method java/util/ArrayList."<init>":()V
      18: putfield      #32                 // Field b:Ljava/util/List;
      21: aload_1
      22: ifnull        30
      25: aload_0
      26: aload_1
      27: invokespecial #35                 // Method b:(Ljava/util/List;)V
      30: aload_0
      31: aload_2
      32: putfield      #37                 // Field a:Ljava/util/List;
      35: return

  static int a(b.a.a.c, b.a.a.b, int);
    Code:
       0: aload_0
       1: aload_1
       2: iload_2
       3: invokespecial #71                 // Method a:(Lb/a/a/b;I)I
       6: ireturn

  static int a(b.a.a.c, b.a.a.b, boolean);
    Code:
       0: aload_0
       1: aload_1
       2: iload_2
       3: invokespecial #89                 // Method a:(Lb/a/a/b;Z)I
       6: ireturn

  static java.util.List a(b.a.a.c);
    Code:
       0: aload_0
       1: getfield      #32                 // Field b:Ljava/util/List;
       4: areturn

  static b.a.a.c$a b(b.a.a.c);
    Code:
       0: aload_0
       1: getfield      #95                 // Field d:Lb/a/a/c$a;
       4: areturn

  public int a();
    Code:
       0: aload_0
       1: getfield      #32                 // Field b:Ljava/util/List;
       4: ifnonnull     9
       7: iconst_0
       8: ireturn
       9: aload_0
      10: getfield      #32                 // Field b:Ljava/util/List;
      13: invokeinterface #81,  1           // InterfaceMethod java/util/List.size:()I
      18: ireturn

  public void a(android.support.v7.widget.RecyclerView$x, int);
    Code:
       0: aload_1
       1: getfield      #105                // Field android/support/v7/widget/RecyclerView$x.a:Landroid/view/View;
       4: aload_0
       5: getfield      #32                 // Field b:Ljava/util/List;
       8: iload_2
       9: invokeinterface #109,  2          // InterfaceMethod java/util/List.get:(I)Ljava/lang/Object;
      14: checkcast     #43                 // class b/a/a/b
      17: invokevirtual #111                // Method b/a/a/b.a:()I
      20: aload_0
      21: getfield      #27                 // Field c:I
      24: imul
      25: iconst_3
      26: iconst_3
      27: iconst_3
      28: invokevirtual #117                // Method android/view/View.setPadding:(IIII)V
      31: aload_1
      32: getfield      #105                // Field android/support/v7/widget/RecyclerView$x.a:Landroid/view/View;
      35: new           #7                  // class b/a/a/c$1
      38: dup
      39: aload_0
      40: aload_1
      41: invokespecial #120                // Method b/a/a/c$1."<init>":(Lb/a/a/c;Landroid/support/v7/widget/RecyclerView$x;)V
      44: invokevirtual #124                // Method android/view/View.setOnClickListener:(Landroid/view/View$OnClickListener;)V
      47: aload_0
      48: getfield      #37                 // Field a:Ljava/util/List;
      51: invokeinterface #52,  1           // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
      56: astore_3
      57: aload_3
      58: invokeinterface #58,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
      63: ifeq          129
      66: aload_3
      67: invokeinterface #62,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
      72: checkcast     #126                // class b/a/a/d
      75: astore        4
      77: aload         4
      79: invokevirtual #127                // Method b/a/a/d.a:()I
      82: aload_0
      83: getfield      #32                 // Field b:Ljava/util/List;
      86: iload_2
      87: invokeinterface #109,  2          // InterfaceMethod java/util/List.get:(I)Ljava/lang/Object;
      92: checkcast     #43                 // class b/a/a/b
      95: invokevirtual #130                // Method b/a/a/b.d:()Lb/a/a/a;
      98: invokeinterface #133,  1          // InterfaceMethod b/a/a/a.a:()I
     103: if_icmpne     57
     106: aload         4
     108: aload_1
     109: iload_2
     110: aload_0
     111: getfield      #32                 // Field b:Ljava/util/List;
     114: iload_2
     115: invokeinterface #109,  2          // InterfaceMethod java/util/List.get:(I)Ljava/lang/Object;
     120: checkcast     #43                 // class b/a/a/b
     123: invokevirtual #136                // Method b/a/a/d.a:(Landroid/support/v7/widget/RecyclerView$x;ILb/a/a/b;)V
     126: goto          57
     129: return

  public void a(android.support.v7.widget.RecyclerView$x, int, java.util.List<java.lang.Object>);
    Code:
       0: aload_3
       1: ifnull        123
       4: aload_3
       5: invokeinterface #140,  1          // InterfaceMethod java/util/List.isEmpty:()Z
      10: ifne          123
      13: aload_3
      14: iconst_0
      15: invokeinterface #109,  2          // InterfaceMethod java/util/List.get:(I)Ljava/lang/Object;
      20: checkcast     #142                // class android/os/Bundle
      23: astore        5
      25: aload         5
      27: invokevirtual #146                // Method android/os/Bundle.keySet:()Ljava/util/Set;
      30: invokeinterface #149,  1          // InterfaceMethod java/util/Set.iterator:()Ljava/util/Iterator;
      35: astore        6
      37: aload         6
      39: invokeinterface #58,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
      44: ifeq          123
      47: aload         6
      49: invokeinterface #62,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
      54: checkcast     #151                // class java/lang/String
      57: astore        7
      59: iconst_m1
      60: istore        4
      62: aload         7
      64: invokevirtual #154                // Method java/lang/String.hashCode:()I
      67: ldc           #155                // int 296813391
      69: if_icmpeq     75
      72: goto          88
      75: aload         7
      77: ldc           #157                // String IS_EXPAND
      79: invokevirtual #160                // Method java/lang/String.equals:(Ljava/lang/Object;)Z
      82: ifeq          88
      85: iconst_0
      86: istore        4
      88: iload         4
      90: ifeq          96
      93: goto          37
      96: aload_0
      97: getfield      #95                 // Field d:Lb/a/a/c$a;
     100: ifnull        37
     103: aload_0
     104: getfield      #95                 // Field d:Lb/a/a/c$a;
     107: aload         5
     109: aload         7
     111: invokevirtual #164                // Method android/os/Bundle.getBoolean:(Ljava/lang/String;)Z
     114: aload_1
     115: invokeinterface #167,  3          // InterfaceMethod b/a/a/c$a.a:(ZLandroid/support/v7/widget/RecyclerView$x;)V
     120: goto          37
     123: aload_0
     124: aload_1
     125: iload_2
     126: aload_3
     127: invokespecial #169                // Method android/support/v7/widget/RecyclerView$a.a:(Landroid/support/v7/widget/RecyclerView$x;ILjava/util/List;)V
     130: return

  public void a(b.a.a.c$a);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #95                 // Field d:Lb/a/a/c$a;
       5: return

  public void a(java.util.List<b.a.a.b>);
    Code:
       0: aload_0
       1: getfield      #32                 // Field b:Ljava/util/List;
       4: invokeinterface #174,  1          // InterfaceMethod java/util/List.clear:()V
       9: aload_0
      10: aload_1
      11: invokespecial #35                 // Method b:(Ljava/util/List;)V
      14: aload_0
      15: invokevirtual #176                // Method e:()V
      18: return

  public int b(int);
    Code:
       0: aload_0
       1: getfield      #32                 // Field b:Ljava/util/List;
       4: iload_1
       5: invokeinterface #109,  2          // InterfaceMethod java/util/List.get:(I)Ljava/lang/Object;
      10: checkcast     #43                 // class b/a/a/b
      13: invokevirtual #130                // Method b/a/a/b.d:()Lb/a/a/a;
      16: invokeinterface #133,  1          // InterfaceMethod b/a/a/a.a:()I
      21: ireturn

  public android.support.v7.widget.RecyclerView$x b(android.view.ViewGroup, int);
    Code:
       0: aload_1
       1: invokevirtual #184                // Method android/view/ViewGroup.getContext:()Landroid/content/Context;
       4: invokestatic  #190                // Method android/view/LayoutInflater.from:(Landroid/content/Context;)Landroid/view/LayoutInflater;
       7: iload_2
       8: aload_1
       9: iconst_0
      10: invokevirtual #194                // Method android/view/LayoutInflater.inflate:(ILandroid/view/ViewGroup;Z)Landroid/view/View;
      13: astore_1
      14: aload_0
      15: getfield      #37                 // Field a:Ljava/util/List;
      18: invokeinterface #81,  1           // InterfaceMethod java/util/List.size:()I
      23: iconst_1
      24: if_icmpne     45
      27: aload_0
      28: getfield      #37                 // Field a:Ljava/util/List;
      31: iconst_0
      32: invokeinterface #109,  2          // InterfaceMethod java/util/List.get:(I)Ljava/lang/Object;
      37: checkcast     #126                // class b/a/a/d
      40: aload_1
      41: invokevirtual #197                // Method b/a/a/d.b:(Landroid/view/View;)Landroid/support/v7/widget/RecyclerView$x;
      44: areturn
      45: aload_0
      46: getfield      #37                 // Field a:Ljava/util/List;
      49: invokeinterface #52,  1           // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
      54: astore_3
      55: aload_3
      56: invokeinterface #58,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
      61: ifeq          27
      64: aload_3
      65: invokeinterface #62,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
      70: checkcast     #126                // class b/a/a/d
      73: astore        4
      75: aload         4
      77: invokevirtual #127                // Method b/a/a/d.a:()I
      80: iload_2
      81: if_icmpne     55
      84: aload         4
      86: aload_1
      87: invokevirtual #197                // Method b/a/a/d.b:(Landroid/view/View;)Landroid/support/v7/widget/RecyclerView$x;
      90: areturn
}
