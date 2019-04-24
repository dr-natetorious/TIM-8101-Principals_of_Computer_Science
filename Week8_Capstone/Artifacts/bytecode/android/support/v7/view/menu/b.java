public abstract class android.support.v7.view.menu.b implements android.support.v7.view.menu.o {
  protected android.content.Context a;

  protected android.content.Context b;

  protected android.support.v7.view.menu.h c;

  protected android.view.LayoutInflater d;

  protected android.view.LayoutInflater e;

  protected android.support.v7.view.menu.p f;

  public android.support.v7.view.menu.b(android.content.Context, int, int);
    Code:
       0: aload_0
       1: invokespecial #27                 // Method java/lang/Object."<init>":()V
       4: aload_0
       5: aload_1
       6: putfield      #29                 // Field a:Landroid/content/Context;
       9: aload_0
      10: aload_1
      11: invokestatic  #35                 // Method android/view/LayoutInflater.from:(Landroid/content/Context;)Landroid/view/LayoutInflater;
      14: putfield      #37                 // Field d:Landroid/view/LayoutInflater;
      17: aload_0
      18: iload_2
      19: putfield      #39                 // Field h:I
      22: aload_0
      23: iload_3
      24: putfield      #41                 // Field i:I
      27: return

  public android.support.v7.view.menu.p a(android.view.ViewGroup);
    Code:
       0: aload_0
       1: getfield      #45                 // Field f:Landroid/support/v7/view/menu/p;
       4: ifnonnull     45
       7: aload_0
       8: aload_0
       9: getfield      #37                 // Field d:Landroid/view/LayoutInflater;
      12: aload_0
      13: getfield      #39                 // Field h:I
      16: aload_1
      17: iconst_0
      18: invokevirtual #49                 // Method android/view/LayoutInflater.inflate:(ILandroid/view/ViewGroup;Z)Landroid/view/View;
      21: checkcast     #51                 // class android/support/v7/view/menu/p
      24: putfield      #45                 // Field f:Landroid/support/v7/view/menu/p;
      27: aload_0
      28: getfield      #45                 // Field f:Landroid/support/v7/view/menu/p;
      31: aload_0
      32: getfield      #53                 // Field c:Landroid/support/v7/view/menu/h;
      35: invokeinterface #56,  2           // InterfaceMethod android/support/v7/view/menu/p.a:(Landroid/support/v7/view/menu/h;)V
      40: aload_0
      41: iconst_1
      42: invokevirtual #59                 // Method a:(Z)V
      45: aload_0
      46: getfield      #45                 // Field f:Landroid/support/v7/view/menu/p;
      49: areturn

  public android.view.View a(android.support.v7.view.menu.j, android.view.View, android.view.ViewGroup);
    Code:
       0: aload_2
       1: instanceof    #62                 // class android/support/v7/view/menu/p$a
       4: ifeq          15
       7: aload_2
       8: checkcast     #62                 // class android/support/v7/view/menu/p$a
      11: astore_2
      12: goto          21
      15: aload_0
      16: aload_3
      17: invokevirtual #65                 // Method b:(Landroid/view/ViewGroup;)Landroid/support/v7/view/menu/p$a;
      20: astore_2
      21: aload_0
      22: aload_1
      23: aload_2
      24: invokevirtual #68                 // Method a:(Landroid/support/v7/view/menu/j;Landroid/support/v7/view/menu/p$a;)V
      27: aload_2
      28: checkcast     #70                 // class android/view/View
      31: areturn

  public void a(int);
    Code:
       0: aload_0
       1: iload_1
       2: putfield      #73                 // Field j:I
       5: return

  public void a(android.content.Context, android.support.v7.view.menu.h);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #76                 // Field b:Landroid/content/Context;
       5: aload_0
       6: aload_0
       7: getfield      #76                 // Field b:Landroid/content/Context;
      10: invokestatic  #35                 // Method android/view/LayoutInflater.from:(Landroid/content/Context;)Landroid/view/LayoutInflater;
      13: putfield      #78                 // Field e:Landroid/view/LayoutInflater;
      16: aload_0
      17: aload_2
      18: putfield      #53                 // Field c:Landroid/support/v7/view/menu/h;
      21: return

  public void a(android.support.v7.view.menu.h, boolean);
    Code:
       0: aload_0
       1: getfield      #81                 // Field g:Landroid/support/v7/view/menu/o$a;
       4: ifnull        18
       7: aload_0
       8: getfield      #81                 // Field g:Landroid/support/v7/view/menu/o$a;
      11: aload_1
      12: iload_2
      13: invokeinterface #85,  3           // InterfaceMethod android/support/v7/view/menu/o$a.a:(Landroid/support/v7/view/menu/h;Z)V
      18: return

  public abstract void a(android.support.v7.view.menu.j, android.support.v7.view.menu.p$a);

  public void a(android.support.v7.view.menu.o$a);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #81                 // Field g:Landroid/support/v7/view/menu/o$a;
       5: return

  protected void a(android.view.View, int);
    Code:
       0: aload_1
       1: invokevirtual #91                 // Method android/view/View.getParent:()Landroid/view/ViewParent;
       4: checkcast     #93                 // class android/view/ViewGroup
       7: astore_3
       8: aload_3
       9: ifnull        17
      12: aload_3
      13: aload_1
      14: invokevirtual #97                 // Method android/view/ViewGroup.removeView:(Landroid/view/View;)V
      17: aload_0
      18: getfield      #45                 // Field f:Landroid/support/v7/view/menu/p;
      21: checkcast     #93                 // class android/view/ViewGroup
      24: aload_1
      25: iload_2
      26: invokevirtual #100                // Method android/view/ViewGroup.addView:(Landroid/view/View;I)V
      29: return

  public void a(boolean);
    Code:
       0: aload_0
       1: getfield      #45                 // Field f:Landroid/support/v7/view/menu/p;
       4: checkcast     #93                 // class android/view/ViewGroup
       7: astore        7
       9: aload         7
      11: ifnonnull     15
      14: return
      15: aload_0
      16: getfield      #53                 // Field c:Landroid/support/v7/view/menu/h;
      19: astore        6
      21: iconst_0
      22: istore_2
      23: aload         6
      25: ifnull        178
      28: aload_0
      29: getfield      #53                 // Field c:Landroid/support/v7/view/menu/h;
      32: invokevirtual #104                // Method android/support/v7/view/menu/h.j:()V
      35: aload_0
      36: getfield      #53                 // Field c:Landroid/support/v7/view/menu/h;
      39: invokevirtual #107                // Method android/support/v7/view/menu/h.i:()Ljava/util/ArrayList;
      42: astore        8
      44: aload         8
      46: invokevirtual #113                // Method java/util/ArrayList.size:()I
      49: istore        5
      51: iconst_0
      52: istore_3
      53: iconst_0
      54: istore_2
      55: iload_3
      56: iload         5
      58: if_icmpge     178
      61: aload         8
      63: iload_3
      64: invokevirtual #117                // Method java/util/ArrayList.get:(I)Ljava/lang/Object;
      67: checkcast     #119                // class android/support/v7/view/menu/j
      70: astore        9
      72: iload_2
      73: istore        4
      75: aload_0
      76: iload_2
      77: aload         9
      79: invokevirtual #122                // Method a:(ILandroid/support/v7/view/menu/j;)Z
      82: ifeq          168
      85: aload         7
      87: iload_2
      88: invokevirtual #126                // Method android/view/ViewGroup.getChildAt:(I)Landroid/view/View;
      91: astore        10
      93: aload         10
      95: instanceof    #62                 // class android/support/v7/view/menu/p$a
      98: ifeq          116
     101: aload         10
     103: checkcast     #62                 // class android/support/v7/view/menu/p$a
     106: invokeinterface #130,  1          // InterfaceMethod android/support/v7/view/menu/p$a.getItemData:()Landroid/support/v7/view/menu/j;
     111: astore        6
     113: goto          119
     116: aconst_null
     117: astore        6
     119: aload_0
     120: aload         9
     122: aload         10
     124: aload         7
     126: invokevirtual #132                // Method a:(Landroid/support/v7/view/menu/j;Landroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
     129: astore        11
     131: aload         9
     133: aload         6
     135: if_acmpeq     149
     138: aload         11
     140: iconst_0
     141: invokevirtual #135                // Method android/view/View.setPressed:(Z)V
     144: aload         11
     146: invokevirtual #138                // Method android/view/View.jumpDrawablesToCurrentState:()V
     149: aload         11
     151: aload         10
     153: if_acmpeq     163
     156: aload_0
     157: aload         11
     159: iload_2
     160: invokevirtual #140                // Method a:(Landroid/view/View;I)V
     163: iload_2
     164: iconst_1
     165: iadd
     166: istore        4
     168: iload_3
     169: iconst_1
     170: iadd
     171: istore_3
     172: iload         4
     174: istore_2
     175: goto          55
     178: iload_2
     179: aload         7
     181: invokevirtual #143                // Method android/view/ViewGroup.getChildCount:()I
     184: if_icmpge     204
     187: aload_0
     188: aload         7
     190: iload_2
     191: invokevirtual #146                // Method a:(Landroid/view/ViewGroup;I)Z
     194: ifne          178
     197: iload_2
     198: iconst_1
     199: iadd
     200: istore_2
     201: goto          178
     204: return

  public boolean a();
    Code:
       0: iconst_0
       1: ireturn

  public boolean a(int, android.support.v7.view.menu.j);
    Code:
       0: iconst_1
       1: ireturn

  public boolean a(android.support.v7.view.menu.h, android.support.v7.view.menu.j);
    Code:
       0: iconst_0
       1: ireturn

  public boolean a(android.support.v7.view.menu.u);
    Code:
       0: aload_0
       1: getfield      #81                 // Field g:Landroid/support/v7/view/menu/o$a;
       4: ifnull        18
       7: aload_0
       8: getfield      #81                 // Field g:Landroid/support/v7/view/menu/o$a;
      11: aload_1
      12: invokeinterface #152,  2          // InterfaceMethod android/support/v7/view/menu/o$a.a:(Landroid/support/v7/view/menu/h;)Z
      17: ireturn
      18: iconst_0
      19: ireturn

  protected boolean a(android.view.ViewGroup, int);
    Code:
       0: aload_1
       1: iload_2
       2: invokevirtual #155                // Method android/view/ViewGroup.removeViewAt:(I)V
       5: iconst_1
       6: ireturn

  public int b();
    Code:
       0: aload_0
       1: getfield      #73                 // Field j:I
       4: ireturn

  public android.support.v7.view.menu.p$a b(android.view.ViewGroup);
    Code:
       0: aload_0
       1: getfield      #37                 // Field d:Landroid/view/LayoutInflater;
       4: aload_0
       5: getfield      #41                 // Field i:I
       8: aload_1
       9: iconst_0
      10: invokevirtual #49                 // Method android/view/LayoutInflater.inflate:(ILandroid/view/ViewGroup;Z)Landroid/view/View;
      13: checkcast     #62                 // class android/support/v7/view/menu/p$a
      16: areturn

  public boolean b(android.support.v7.view.menu.h, android.support.v7.view.menu.j);
    Code:
       0: iconst_0
       1: ireturn

  public android.support.v7.view.menu.o$a d();
    Code:
       0: aload_0
       1: getfield      #81                 // Field g:Landroid/support/v7/view/menu/o$a;
       4: areturn
}
