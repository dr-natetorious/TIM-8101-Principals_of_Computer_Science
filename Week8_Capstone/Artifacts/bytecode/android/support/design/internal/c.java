public class android.support.design.internal.c implements android.support.v7.view.menu.o {
  android.widget.LinearLayout a;

  android.support.v7.view.menu.h b;

  android.support.design.internal.c$b c;

  android.view.LayoutInflater d;

  int e;

  boolean f;

  android.content.res.ColorStateList g;

  android.content.res.ColorStateList h;

  android.graphics.drawable.Drawable i;

  int j;

  final android.view.View$OnClickListener k;

  public android.support.design.internal.c();
    Code:
       0: aload_0
       1: invokespecial #58                 // Method java/lang/Object."<init>":()V
       4: aload_0
       5: new           #8                  // class android/support/design/internal/c$1
       8: dup
       9: aload_0
      10: invokespecial #61                 // Method android/support/design/internal/c$1."<init>":(Landroid/support/design/internal/c;)V
      13: putfield      #63                 // Field k:Landroid/view/View$OnClickListener;
      16: return

  public android.support.v7.view.menu.p a(android.view.ViewGroup);
    Code:
       0: aload_0
       1: getfield      #67                 // Field l:Landroid/support/design/internal/NavigationMenuView;
       4: ifnonnull     78
       7: aload_0
       8: aload_0
       9: getfield      #69                 // Field d:Landroid/view/LayoutInflater;
      12: getstatic     #74                 // Field android/support/design/a$h.design_navigation_menu:I
      15: aload_1
      16: iconst_0
      17: invokevirtual #80                 // Method android/view/LayoutInflater.inflate:(ILandroid/view/ViewGroup;Z)Landroid/view/View;
      20: checkcast     #82                 // class android/support/design/internal/NavigationMenuView
      23: putfield      #67                 // Field l:Landroid/support/design/internal/NavigationMenuView;
      26: aload_0
      27: getfield      #84                 // Field c:Landroid/support/design/internal/c$b;
      30: ifnonnull     45
      33: aload_0
      34: new           #13                 // class android/support/design/internal/c$b
      37: dup
      38: aload_0
      39: invokespecial #85                 // Method android/support/design/internal/c$b."<init>":(Landroid/support/design/internal/c;)V
      42: putfield      #84                 // Field c:Landroid/support/design/internal/c$b;
      45: aload_0
      46: aload_0
      47: getfield      #69                 // Field d:Landroid/view/LayoutInflater;
      50: getstatic     #88                 // Field android/support/design/a$h.design_navigation_item_header:I
      53: aload_0
      54: getfield      #67                 // Field l:Landroid/support/design/internal/NavigationMenuView;
      57: iconst_0
      58: invokevirtual #80                 // Method android/view/LayoutInflater.inflate:(ILandroid/view/ViewGroup;Z)Landroid/view/View;
      61: checkcast     #90                 // class android/widget/LinearLayout
      64: putfield      #92                 // Field a:Landroid/widget/LinearLayout;
      67: aload_0
      68: getfield      #67                 // Field l:Landroid/support/design/internal/NavigationMenuView;
      71: aload_0
      72: getfield      #84                 // Field c:Landroid/support/design/internal/c$b;
      75: invokevirtual #96                 // Method android/support/design/internal/NavigationMenuView.setAdapter:(Landroid/support/v7/widget/RecyclerView$a;)V
      78: aload_0
      79: getfield      #67                 // Field l:Landroid/support/design/internal/NavigationMenuView;
      82: areturn

  public void a(int);
    Code:
       0: aload_0
       1: iload_1
       2: putfield      #99                 // Field n:I
       5: return

  public void a(android.content.Context, android.support.v7.view.menu.h);
    Code:
       0: aload_0
       1: aload_1
       2: invokestatic  #104                // Method android/view/LayoutInflater.from:(Landroid/content/Context;)Landroid/view/LayoutInflater;
       5: putfield      #69                 // Field d:Landroid/view/LayoutInflater;
       8: aload_0
       9: aload_2
      10: putfield      #106                // Field b:Landroid/support/v7/view/menu/h;
      13: aload_0
      14: aload_1
      15: invokevirtual #112                // Method android/content/Context.getResources:()Landroid/content/res/Resources;
      18: getstatic     #117                // Field android/support/design/a$d.design_navigation_separator_vertical_padding:I
      21: invokevirtual #123                // Method android/content/res/Resources.getDimensionPixelOffset:(I)I
      24: putfield      #125                // Field j:I
      27: return

  public void a(android.content.res.ColorStateList);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #128                // Field h:Landroid/content/res/ColorStateList;
       5: aload_0
       6: iconst_0
       7: invokevirtual #131                // Method a:(Z)V
      10: return

  public void a(android.graphics.drawable.Drawable);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #134                // Field i:Landroid/graphics/drawable/Drawable;
       5: aload_0
       6: iconst_0
       7: invokevirtual #131                // Method a:(Z)V
      10: return

  public void a(android.os.Parcelable);
    Code:
       0: aload_1
       1: instanceof    #137                // class android/os/Bundle
       4: ifeq          69
       7: aload_1
       8: checkcast     #137                // class android/os/Bundle
      11: astore_1
      12: aload_1
      13: ldc           #139                // String android:menu:list
      15: invokevirtual #143                // Method android/os/Bundle.getSparseParcelableArray:(Ljava/lang/String;)Landroid/util/SparseArray;
      18: astore_2
      19: aload_2
      20: ifnull        31
      23: aload_0
      24: getfield      #67                 // Field l:Landroid/support/design/internal/NavigationMenuView;
      27: aload_2
      28: invokevirtual #147                // Method android/support/design/internal/NavigationMenuView.restoreHierarchyState:(Landroid/util/SparseArray;)V
      31: aload_1
      32: ldc           #149                // String android:menu:adapter
      34: invokevirtual #153                // Method android/os/Bundle.getBundle:(Ljava/lang/String;)Landroid/os/Bundle;
      37: astore_2
      38: aload_2
      39: ifnull        50
      42: aload_0
      43: getfield      #84                 // Field c:Landroid/support/design/internal/c$b;
      46: aload_2
      47: invokevirtual #156                // Method android/support/design/internal/c$b.a:(Landroid/os/Bundle;)V
      50: aload_1
      51: ldc           #158                // String android:menu:header
      53: invokevirtual #143                // Method android/os/Bundle.getSparseParcelableArray:(Ljava/lang/String;)Landroid/util/SparseArray;
      56: astore_1
      57: aload_1
      58: ifnull        69
      61: aload_0
      62: getfield      #92                 // Field a:Landroid/widget/LinearLayout;
      65: aload_1
      66: invokevirtual #159                // Method android/widget/LinearLayout.restoreHierarchyState:(Landroid/util/SparseArray;)V
      69: return

  public void a(android.support.v4.view.ab);
    Code:
       0: aload_1
       1: invokevirtual #165                // Method android/support/v4/view/ab.b:()I
       4: istore_2
       5: aload_0
       6: getfield      #167                // Field o:I
       9: iload_2
      10: if_icmpeq     48
      13: aload_0
      14: iload_2
      15: putfield      #167                // Field o:I
      18: aload_0
      19: getfield      #92                 // Field a:Landroid/widget/LinearLayout;
      22: invokevirtual #170                // Method android/widget/LinearLayout.getChildCount:()I
      25: ifne          48
      28: aload_0
      29: getfield      #67                 // Field l:Landroid/support/design/internal/NavigationMenuView;
      32: iconst_0
      33: aload_0
      34: getfield      #167                // Field o:I
      37: iconst_0
      38: aload_0
      39: getfield      #67                 // Field l:Landroid/support/design/internal/NavigationMenuView;
      42: invokevirtual #173                // Method android/support/design/internal/NavigationMenuView.getPaddingBottom:()I
      45: invokevirtual #177                // Method android/support/design/internal/NavigationMenuView.setPadding:(IIII)V
      48: aload_0
      49: getfield      #92                 // Field a:Landroid/widget/LinearLayout;
      52: aload_1
      53: invokestatic  #182                // Method android/support/v4/view/s.b:(Landroid/view/View;Landroid/support/v4/view/ab;)Landroid/support/v4/view/ab;
      56: pop
      57: return

  public void a(android.support.v7.view.menu.h, boolean);
    Code:
       0: aload_0
       1: getfield      #185                // Field m:Landroid/support/v7/view/menu/o$a;
       4: ifnull        18
       7: aload_0
       8: getfield      #185                // Field m:Landroid/support/v7/view/menu/o$a;
      11: aload_1
      12: iload_2
      13: invokeinterface #189,  3          // InterfaceMethod android/support/v7/view/menu/o$a.a:(Landroid/support/v7/view/menu/h;Z)V
      18: return

  public void a(android.support.v7.view.menu.j);
    Code:
       0: aload_0
       1: getfield      #84                 // Field c:Landroid/support/design/internal/c$b;
       4: aload_1
       5: invokevirtual #192                // Method android/support/design/internal/c$b.a:(Landroid/support/v7/view/menu/j;)V
       8: return

  public void a(android.support.v7.view.menu.o$a);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #185                // Field m:Landroid/support/v7/view/menu/o$a;
       5: return

  public void a(android.view.View);
    Code:
       0: aload_0
       1: getfield      #92                 // Field a:Landroid/widget/LinearLayout;
       4: aload_1
       5: invokevirtual #197                // Method android/widget/LinearLayout.addView:(Landroid/view/View;)V
       8: aload_0
       9: getfield      #67                 // Field l:Landroid/support/design/internal/NavigationMenuView;
      12: iconst_0
      13: iconst_0
      14: iconst_0
      15: aload_0
      16: getfield      #67                 // Field l:Landroid/support/design/internal/NavigationMenuView;
      19: invokevirtual #173                // Method android/support/design/internal/NavigationMenuView.getPaddingBottom:()I
      22: invokevirtual #177                // Method android/support/design/internal/NavigationMenuView.setPadding:(IIII)V
      25: return

  public void a(boolean);
    Code:
       0: aload_0
       1: getfield      #84                 // Field c:Landroid/support/design/internal/c$b;
       4: ifnull        14
       7: aload_0
       8: getfield      #84                 // Field c:Landroid/support/design/internal/c$b;
      11: invokevirtual #199                // Method android/support/design/internal/c$b.b:()V
      14: return

  public boolean a();
    Code:
       0: iconst_0
       1: ireturn

  public boolean a(android.support.v7.view.menu.h, android.support.v7.view.menu.j);
    Code:
       0: iconst_0
       1: ireturn

  public boolean a(android.support.v7.view.menu.u);
    Code:
       0: iconst_0
       1: ireturn

  public int b();
    Code:
       0: aload_0
       1: getfield      #99                 // Field n:I
       4: ireturn

  public android.view.View b(int);
    Code:
       0: aload_0
       1: getfield      #69                 // Field d:Landroid/view/LayoutInflater;
       4: iload_1
       5: aload_0
       6: getfield      #92                 // Field a:Landroid/widget/LinearLayout;
       9: iconst_0
      10: invokevirtual #80                 // Method android/view/LayoutInflater.inflate:(ILandroid/view/ViewGroup;Z)Landroid/view/View;
      13: astore_2
      14: aload_0
      15: aload_2
      16: invokevirtual #205                // Method a:(Landroid/view/View;)V
      19: aload_2
      20: areturn

  public void b(android.content.res.ColorStateList);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #207                // Field g:Landroid/content/res/ColorStateList;
       5: aload_0
       6: iconst_0
       7: invokevirtual #131                // Method a:(Z)V
      10: return

  public void b(boolean);
    Code:
       0: aload_0
       1: getfield      #84                 // Field c:Landroid/support/design/internal/c$b;
       4: ifnull        15
       7: aload_0
       8: getfield      #84                 // Field c:Landroid/support/design/internal/c$b;
      11: iload_1
      12: invokevirtual #208                // Method android/support/design/internal/c$b.a:(Z)V
      15: return

  public boolean b(android.support.v7.view.menu.h, android.support.v7.view.menu.j);
    Code:
       0: iconst_0
       1: ireturn

  public android.os.Parcelable c();
    Code:
       0: getstatic     #214                // Field android/os/Build$VERSION.SDK_INT:I
       3: bipush        11
       5: if_icmplt     98
       8: new           #137                // class android/os/Bundle
      11: dup
      12: invokespecial #215                // Method android/os/Bundle."<init>":()V
      15: astore_1
      16: aload_0
      17: getfield      #67                 // Field l:Landroid/support/design/internal/NavigationMenuView;
      20: ifnull        46
      23: new           #217                // class android/util/SparseArray
      26: dup
      27: invokespecial #218                // Method android/util/SparseArray."<init>":()V
      30: astore_2
      31: aload_0
      32: getfield      #67                 // Field l:Landroid/support/design/internal/NavigationMenuView;
      35: aload_2
      36: invokevirtual #221                // Method android/support/design/internal/NavigationMenuView.saveHierarchyState:(Landroid/util/SparseArray;)V
      39: aload_1
      40: ldc           #139                // String android:menu:list
      42: aload_2
      43: invokevirtual #225                // Method android/os/Bundle.putSparseParcelableArray:(Ljava/lang/String;Landroid/util/SparseArray;)V
      46: aload_0
      47: getfield      #84                 // Field c:Landroid/support/design/internal/c$b;
      50: ifnull        66
      53: aload_1
      54: ldc           #149                // String android:menu:adapter
      56: aload_0
      57: getfield      #84                 // Field c:Landroid/support/design/internal/c$b;
      60: invokevirtual #228                // Method android/support/design/internal/c$b.c:()Landroid/os/Bundle;
      63: invokevirtual #232                // Method android/os/Bundle.putBundle:(Ljava/lang/String;Landroid/os/Bundle;)V
      66: aload_0
      67: getfield      #92                 // Field a:Landroid/widget/LinearLayout;
      70: ifnull        96
      73: new           #217                // class android/util/SparseArray
      76: dup
      77: invokespecial #218                // Method android/util/SparseArray."<init>":()V
      80: astore_2
      81: aload_0
      82: getfield      #92                 // Field a:Landroid/widget/LinearLayout;
      85: aload_2
      86: invokevirtual #233                // Method android/widget/LinearLayout.saveHierarchyState:(Landroid/util/SparseArray;)V
      89: aload_1
      90: ldc           #158                // String android:menu:header
      92: aload_2
      93: invokevirtual #225                // Method android/os/Bundle.putSparseParcelableArray:(Ljava/lang/String;Landroid/util/SparseArray;)V
      96: aload_1
      97: areturn
      98: aconst_null
      99: areturn

  public void c(int);
    Code:
       0: aload_0
       1: iload_1
       2: putfield      #235                // Field e:I
       5: aload_0
       6: iconst_1
       7: putfield      #237                // Field f:Z
      10: aload_0
      11: iconst_0
      12: invokevirtual #131                // Method a:(Z)V
      15: return

  public int d();
    Code:
       0: aload_0
       1: getfield      #92                 // Field a:Landroid/widget/LinearLayout;
       4: invokevirtual #170                // Method android/widget/LinearLayout.getChildCount:()I
       7: ireturn

  public android.content.res.ColorStateList e();
    Code:
       0: aload_0
       1: getfield      #128                // Field h:Landroid/content/res/ColorStateList;
       4: areturn

  public android.content.res.ColorStateList f();
    Code:
       0: aload_0
       1: getfield      #207                // Field g:Landroid/content/res/ColorStateList;
       4: areturn

  public android.graphics.drawable.Drawable g();
    Code:
       0: aload_0
       1: getfield      #134                // Field i:Landroid/graphics/drawable/Drawable;
       4: areturn
}
