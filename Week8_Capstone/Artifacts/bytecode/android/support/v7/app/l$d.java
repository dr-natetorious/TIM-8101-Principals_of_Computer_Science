public final class android.support.v7.app.l$d {
  int a;

  int b;

  int c;

  int d;

  int e;

  int f;

  android.view.ViewGroup g;

  android.view.View h;

  android.view.View i;

  android.support.v7.view.menu.h j;

  android.support.v7.view.menu.f k;

  android.content.Context l;

  boolean m;

  boolean n;

  boolean o;

  public boolean p;

  boolean q;

  boolean r;

  android.os.Bundle s;

  android.support.v7.app.l$d(int);
    Code:
       0: aload_0
       1: invokespecial #38                 // Method java/lang/Object."<init>":()V
       4: aload_0
       5: iload_1
       6: putfield      #40                 // Field a:I
       9: aload_0
      10: iconst_0
      11: putfield      #42                 // Field q:Z
      14: return

  android.support.v7.view.menu.p a(android.support.v7.view.menu.o$a);
    Code:
       0: aload_0
       1: getfield      #46                 // Field j:Landroid/support/v7/view/menu/h;
       4: ifnonnull     9
       7: aconst_null
       8: areturn
       9: aload_0
      10: getfield      #48                 // Field k:Landroid/support/v7/view/menu/f;
      13: ifnonnull     53
      16: aload_0
      17: new           #50                 // class android/support/v7/view/menu/f
      20: dup
      21: aload_0
      22: getfield      #52                 // Field l:Landroid/content/Context;
      25: getstatic     #57                 // Field android/support/v7/a/a$g.abc_list_menu_item_layout:I
      28: invokespecial #60                 // Method android/support/v7/view/menu/f."<init>":(Landroid/content/Context;I)V
      31: putfield      #48                 // Field k:Landroid/support/v7/view/menu/f;
      34: aload_0
      35: getfield      #48                 // Field k:Landroid/support/v7/view/menu/f;
      38: aload_1
      39: invokevirtual #63                 // Method android/support/v7/view/menu/f.a:(Landroid/support/v7/view/menu/o$a;)V
      42: aload_0
      43: getfield      #46                 // Field j:Landroid/support/v7/view/menu/h;
      46: aload_0
      47: getfield      #48                 // Field k:Landroid/support/v7/view/menu/f;
      50: invokevirtual #68                 // Method android/support/v7/view/menu/h.a:(Landroid/support/v7/view/menu/o;)V
      53: aload_0
      54: getfield      #48                 // Field k:Landroid/support/v7/view/menu/f;
      57: aload_0
      58: getfield      #70                 // Field g:Landroid/view/ViewGroup;
      61: invokevirtual #73                 // Method android/support/v7/view/menu/f.a:(Landroid/view/ViewGroup;)Landroid/support/v7/view/menu/p;
      64: areturn

  void a(android.content.Context);
    Code:
       0: new           #76                 // class android/util/TypedValue
       3: dup
       4: invokespecial #77                 // Method android/util/TypedValue."<init>":()V
       7: astore        4
       9: aload_1
      10: invokevirtual #83                 // Method android/content/Context.getResources:()Landroid/content/res/Resources;
      13: invokevirtual #89                 // Method android/content/res/Resources.newTheme:()Landroid/content/res/Resources$Theme;
      16: astore_3
      17: aload_3
      18: aload_1
      19: invokevirtual #92                 // Method android/content/Context.getTheme:()Landroid/content/res/Resources$Theme;
      22: invokevirtual #98                 // Method android/content/res/Resources$Theme.setTo:(Landroid/content/res/Resources$Theme;)V
      25: aload_3
      26: getstatic     #103                // Field android/support/v7/a/a$a.actionBarPopupTheme:I
      29: aload         4
      31: iconst_1
      32: invokevirtual #107                // Method android/content/res/Resources$Theme.resolveAttribute:(ILandroid/util/TypedValue;Z)Z
      35: pop
      36: aload         4
      38: getfield      #110                // Field android/util/TypedValue.resourceId:I
      41: ifeq          54
      44: aload_3
      45: aload         4
      47: getfield      #110                // Field android/util/TypedValue.resourceId:I
      50: iconst_1
      51: invokevirtual #114                // Method android/content/res/Resources$Theme.applyStyle:(IZ)V
      54: aload_3
      55: getstatic     #117                // Field android/support/v7/a/a$a.panelMenuListTheme:I
      58: aload         4
      60: iconst_1
      61: invokevirtual #107                // Method android/content/res/Resources$Theme.resolveAttribute:(ILandroid/util/TypedValue;Z)Z
      64: pop
      65: aload         4
      67: getfield      #110                // Field android/util/TypedValue.resourceId:I
      70: ifeq          88
      73: aload         4
      75: getfield      #110                // Field android/util/TypedValue.resourceId:I
      78: istore_2
      79: aload_3
      80: iload_2
      81: iconst_1
      82: invokevirtual #114                // Method android/content/res/Resources$Theme.applyStyle:(IZ)V
      85: goto          95
      88: getstatic     #122                // Field android/support/v7/a/a$i.Theme_AppCompat_CompactMenu:I
      91: istore_2
      92: goto          79
      95: new           #124                // class android/support/v7/view/d
      98: dup
      99: aload_1
     100: iconst_0
     101: invokespecial #125                // Method android/support/v7/view/d."<init>":(Landroid/content/Context;I)V
     104: astore_1
     105: aload_1
     106: invokevirtual #92                 // Method android/content/Context.getTheme:()Landroid/content/res/Resources$Theme;
     109: aload_3
     110: invokevirtual #98                 // Method android/content/res/Resources$Theme.setTo:(Landroid/content/res/Resources$Theme;)V
     113: aload_0
     114: aload_1
     115: putfield      #52                 // Field l:Landroid/content/Context;
     118: aload_1
     119: getstatic     #131                // Field android/support/v7/a/a$j.AppCompatTheme:[I
     122: invokevirtual #135                // Method android/content/Context.obtainStyledAttributes:([I)Landroid/content/res/TypedArray;
     125: astore_1
     126: aload_0
     127: aload_1
     128: getstatic     #138                // Field android/support/v7/a/a$j.AppCompatTheme_panelBackground:I
     131: iconst_0
     132: invokevirtual #144                // Method android/content/res/TypedArray.getResourceId:(II)I
     135: putfield      #146                // Field b:I
     138: aload_0
     139: aload_1
     140: getstatic     #149                // Field android/support/v7/a/a$j.AppCompatTheme_android_windowAnimationStyle:I
     143: iconst_0
     144: invokevirtual #144                // Method android/content/res/TypedArray.getResourceId:(II)I
     147: putfield      #151                // Field f:I
     150: aload_1
     151: invokevirtual #154                // Method android/content/res/TypedArray.recycle:()V
     154: return

  void a(android.support.v7.view.menu.h);
    Code:
       0: aload_1
       1: aload_0
       2: getfield      #46                 // Field j:Landroid/support/v7/view/menu/h;
       5: if_acmpne     9
       8: return
       9: aload_0
      10: getfield      #46                 // Field j:Landroid/support/v7/view/menu/h;
      13: ifnull        27
      16: aload_0
      17: getfield      #46                 // Field j:Landroid/support/v7/view/menu/h;
      20: aload_0
      21: getfield      #48                 // Field k:Landroid/support/v7/view/menu/f;
      24: invokevirtual #157                // Method android/support/v7/view/menu/h.b:(Landroid/support/v7/view/menu/o;)V
      27: aload_0
      28: aload_1
      29: putfield      #46                 // Field j:Landroid/support/v7/view/menu/h;
      32: aload_1
      33: ifnull        51
      36: aload_0
      37: getfield      #48                 // Field k:Landroid/support/v7/view/menu/f;
      40: ifnull        51
      43: aload_1
      44: aload_0
      45: getfield      #48                 // Field k:Landroid/support/v7/view/menu/f;
      48: invokevirtual #68                 // Method android/support/v7/view/menu/h.a:(Landroid/support/v7/view/menu/o;)V
      51: return

  public boolean a();
    Code:
       0: aload_0
       1: getfield      #160                // Field h:Landroid/view/View;
       4: astore_2
       5: iconst_0
       6: istore_1
       7: aload_2
       8: ifnonnull     13
      11: iconst_0
      12: ireturn
      13: aload_0
      14: getfield      #162                // Field i:Landroid/view/View;
      17: ifnull        22
      20: iconst_1
      21: ireturn
      22: aload_0
      23: getfield      #48                 // Field k:Landroid/support/v7/view/menu/f;
      26: invokevirtual #165                // Method android/support/v7/view/menu/f.d:()Landroid/widget/ListAdapter;
      29: invokeinterface #171,  1          // InterfaceMethod android/widget/ListAdapter.getCount:()I
      34: ifle          39
      37: iconst_1
      38: istore_1
      39: iload_1
      40: ireturn
}
