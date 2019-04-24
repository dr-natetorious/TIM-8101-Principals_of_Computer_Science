public class android.support.v7.view.menu.f implements android.support.v7.view.menu.o,android.widget.AdapterView$OnItemClickListener {
  android.content.Context a;

  android.view.LayoutInflater b;

  android.support.v7.view.menu.h c;

  android.support.v7.view.menu.ExpandedMenuView d;

  int e;

  int f;

  int g;

  android.support.v7.view.menu.f$a h;

  public android.support.v7.view.menu.f(int, int);
    Code:
       0: aload_0
       1: invokespecial #32                 // Method java/lang/Object."<init>":()V
       4: aload_0
       5: iload_1
       6: putfield      #34                 // Field g:I
       9: aload_0
      10: iload_2
      11: putfield      #36                 // Field f:I
      14: return

  public android.support.v7.view.menu.f(android.content.Context, int);
    Code:
       0: aload_0
       1: iload_2
       2: iconst_0
       3: invokespecial #40                 // Method "<init>":(II)V
       6: aload_0
       7: aload_1
       8: putfield      #42                 // Field a:Landroid/content/Context;
      11: aload_0
      12: aload_0
      13: getfield      #42                 // Field a:Landroid/content/Context;
      16: invokestatic  #48                 // Method android/view/LayoutInflater.from:(Landroid/content/Context;)Landroid/view/LayoutInflater;
      19: putfield      #50                 // Field b:Landroid/view/LayoutInflater;
      22: return

  public android.support.v7.view.menu.p a(android.view.ViewGroup);
    Code:
       0: aload_0
       1: getfield      #53                 // Field d:Landroid/support/v7/view/menu/ExpandedMenuView;
       4: ifnonnull     64
       7: aload_0
       8: aload_0
       9: getfield      #50                 // Field b:Landroid/view/LayoutInflater;
      12: getstatic     #58                 // Field android/support/v7/a/a$g.abc_expanded_menu_layout:I
      15: aload_1
      16: iconst_0
      17: invokevirtual #62                 // Method android/view/LayoutInflater.inflate:(ILandroid/view/ViewGroup;Z)Landroid/view/View;
      20: checkcast     #64                 // class android/support/v7/view/menu/ExpandedMenuView
      23: putfield      #53                 // Field d:Landroid/support/v7/view/menu/ExpandedMenuView;
      26: aload_0
      27: getfield      #66                 // Field h:Landroid/support/v7/view/menu/f$a;
      30: ifnonnull     45
      33: aload_0
      34: new           #10                 // class android/support/v7/view/menu/f$a
      37: dup
      38: aload_0
      39: invokespecial #69                 // Method android/support/v7/view/menu/f$a."<init>":(Landroid/support/v7/view/menu/f;)V
      42: putfield      #66                 // Field h:Landroid/support/v7/view/menu/f$a;
      45: aload_0
      46: getfield      #53                 // Field d:Landroid/support/v7/view/menu/ExpandedMenuView;
      49: aload_0
      50: getfield      #66                 // Field h:Landroid/support/v7/view/menu/f$a;
      53: invokevirtual #73                 // Method android/support/v7/view/menu/ExpandedMenuView.setAdapter:(Landroid/widget/ListAdapter;)V
      56: aload_0
      57: getfield      #53                 // Field d:Landroid/support/v7/view/menu/ExpandedMenuView;
      60: aload_0
      61: invokevirtual #77                 // Method android/support/v7/view/menu/ExpandedMenuView.setOnItemClickListener:(Landroid/widget/AdapterView$OnItemClickListener;)V
      64: aload_0
      65: getfield      #53                 // Field d:Landroid/support/v7/view/menu/ExpandedMenuView;
      68: areturn

  public void a(android.content.Context, android.support.v7.view.menu.h);
    Code:
       0: aload_0
       1: getfield      #36                 // Field f:I
       4: ifeq          37
       7: aload_0
       8: new           #80                 // class android/view/ContextThemeWrapper
      11: dup
      12: aload_1
      13: aload_0
      14: getfield      #36                 // Field f:I
      17: invokespecial #82                 // Method android/view/ContextThemeWrapper."<init>":(Landroid/content/Context;I)V
      20: putfield      #42                 // Field a:Landroid/content/Context;
      23: aload_0
      24: aload_0
      25: getfield      #42                 // Field a:Landroid/content/Context;
      28: invokestatic  #48                 // Method android/view/LayoutInflater.from:(Landroid/content/Context;)Landroid/view/LayoutInflater;
      31: putfield      #50                 // Field b:Landroid/view/LayoutInflater;
      34: goto          59
      37: aload_0
      38: getfield      #42                 // Field a:Landroid/content/Context;
      41: ifnull        59
      44: aload_0
      45: aload_1
      46: putfield      #42                 // Field a:Landroid/content/Context;
      49: aload_0
      50: getfield      #50                 // Field b:Landroid/view/LayoutInflater;
      53: ifnonnull     59
      56: goto          23
      59: aload_0
      60: aload_2
      61: putfield      #84                 // Field c:Landroid/support/v7/view/menu/h;
      64: aload_0
      65: getfield      #66                 // Field h:Landroid/support/v7/view/menu/f$a;
      68: ifnull        78
      71: aload_0
      72: getfield      #66                 // Field h:Landroid/support/v7/view/menu/f$a;
      75: invokevirtual #87                 // Method android/support/v7/view/menu/f$a.notifyDataSetChanged:()V
      78: return

  public void a(android.os.Bundle);
    Code:
       0: new           #90                 // class android/util/SparseArray
       3: dup
       4: invokespecial #91                 // Method android/util/SparseArray."<init>":()V
       7: astore_2
       8: aload_0
       9: getfield      #53                 // Field d:Landroid/support/v7/view/menu/ExpandedMenuView;
      12: ifnull        23
      15: aload_0
      16: getfield      #53                 // Field d:Landroid/support/v7/view/menu/ExpandedMenuView;
      19: aload_2
      20: invokevirtual #97                 // Method android/view/View.saveHierarchyState:(Landroid/util/SparseArray;)V
      23: aload_1
      24: ldc           #99                 // String android:menu:list
      26: aload_2
      27: invokevirtual #105                // Method android/os/Bundle.putSparseParcelableArray:(Ljava/lang/String;Landroid/util/SparseArray;)V
      30: return

  public void a(android.os.Parcelable);
    Code:
       0: aload_0
       1: aload_1
       2: checkcast     #101                // class android/os/Bundle
       5: invokevirtual #108                // Method b:(Landroid/os/Bundle;)V
       8: return

  public void a(android.support.v7.view.menu.h, boolean);
    Code:
       0: aload_0
       1: getfield      #111                // Field i:Landroid/support/v7/view/menu/o$a;
       4: ifnull        18
       7: aload_0
       8: getfield      #111                // Field i:Landroid/support/v7/view/menu/o$a;
      11: aload_1
      12: iload_2
      13: invokeinterface #115,  3          // InterfaceMethod android/support/v7/view/menu/o$a.a:(Landroid/support/v7/view/menu/h;Z)V
      18: return

  public void a(android.support.v7.view.menu.o$a);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #111                // Field i:Landroid/support/v7/view/menu/o$a;
       5: return

  public void a(boolean);
    Code:
       0: aload_0
       1: getfield      #66                 // Field h:Landroid/support/v7/view/menu/f$a;
       4: ifnull        14
       7: aload_0
       8: getfield      #66                 // Field h:Landroid/support/v7/view/menu/f$a;
      11: invokevirtual #87                 // Method android/support/v7/view/menu/f$a.notifyDataSetChanged:()V
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
       0: aload_1
       1: invokevirtual #125                // Method android/support/v7/view/menu/u.hasVisibleItems:()Z
       4: ifne          9
       7: iconst_0
       8: ireturn
       9: new           #127                // class android/support/v7/view/menu/i
      12: dup
      13: aload_1
      14: invokespecial #130                // Method android/support/v7/view/menu/i."<init>":(Landroid/support/v7/view/menu/h;)V
      17: aconst_null
      18: invokevirtual #133                // Method android/support/v7/view/menu/i.a:(Landroid/os/IBinder;)V
      21: aload_0
      22: getfield      #111                // Field i:Landroid/support/v7/view/menu/o$a;
      25: ifnull        39
      28: aload_0
      29: getfield      #111                // Field i:Landroid/support/v7/view/menu/o$a;
      32: aload_1
      33: invokeinterface #136,  2          // InterfaceMethod android/support/v7/view/menu/o$a.a:(Landroid/support/v7/view/menu/h;)Z
      38: pop
      39: iconst_1
      40: ireturn

  public int b();
    Code:
       0: aload_0
       1: getfield      #139                // Field j:I
       4: ireturn

  public void b(android.os.Bundle);
    Code:
       0: aload_1
       1: ldc           #99                 // String android:menu:list
       3: invokevirtual #143                // Method android/os/Bundle.getSparseParcelableArray:(Ljava/lang/String;)Landroid/util/SparseArray;
       6: astore_1
       7: aload_1
       8: ifnull        19
      11: aload_0
      12: getfield      #53                 // Field d:Landroid/support/v7/view/menu/ExpandedMenuView;
      15: aload_1
      16: invokevirtual #146                // Method android/view/View.restoreHierarchyState:(Landroid/util/SparseArray;)V
      19: return

  public boolean b(android.support.v7.view.menu.h, android.support.v7.view.menu.j);
    Code:
       0: iconst_0
       1: ireturn

  public android.os.Parcelable c();
    Code:
       0: aload_0
       1: getfield      #53                 // Field d:Landroid/support/v7/view/menu/ExpandedMenuView;
       4: ifnonnull     9
       7: aconst_null
       8: areturn
       9: new           #101                // class android/os/Bundle
      12: dup
      13: invokespecial #148                // Method android/os/Bundle."<init>":()V
      16: astore_1
      17: aload_0
      18: aload_1
      19: invokevirtual #150                // Method a:(Landroid/os/Bundle;)V
      22: aload_1
      23: areturn

  public android.widget.ListAdapter d();
    Code:
       0: aload_0
       1: getfield      #66                 // Field h:Landroid/support/v7/view/menu/f$a;
       4: ifnonnull     19
       7: aload_0
       8: new           #10                 // class android/support/v7/view/menu/f$a
      11: dup
      12: aload_0
      13: invokespecial #69                 // Method android/support/v7/view/menu/f$a."<init>":(Landroid/support/v7/view/menu/f;)V
      16: putfield      #66                 // Field h:Landroid/support/v7/view/menu/f$a;
      19: aload_0
      20: getfield      #66                 // Field h:Landroid/support/v7/view/menu/f$a;
      23: areturn

  public void onItemClick(android.widget.AdapterView<?>, android.view.View, int, long);
    Code:
       0: aload_0
       1: getfield      #84                 // Field c:Landroid/support/v7/view/menu/h;
       4: aload_0
       5: getfield      #66                 // Field h:Landroid/support/v7/view/menu/f$a;
       8: iload_3
       9: invokevirtual #156                // Method android/support/v7/view/menu/f$a.a:(I)Landroid/support/v7/view/menu/j;
      12: aload_0
      13: iconst_0
      14: invokevirtual #161                // Method android/support/v7/view/menu/h.a:(Landroid/view/MenuItem;Landroid/support/v7/view/menu/o;I)Z
      17: pop
      18: return
}
