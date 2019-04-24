public class android.support.design.widget.NavigationView extends android.support.design.internal.f {
  android.support.design.widget.NavigationView$a c;

  static {};
    Code:
       0: iconst_1
       1: newarray       int
       3: dup
       4: iconst_0
       5: ldc           #30                 // int 16842912
       7: iastore
       8: putstatic     #32                 // Field d:[I
      11: iconst_1
      12: newarray       int
      14: dup
      15: iconst_0
      16: ldc           #33                 // int -16842910
      18: iastore
      19: putstatic     #35                 // Field e:[I
      22: return

  public android.support.design.widget.NavigationView(android.content.Context);
    Code:
       0: aload_0
       1: aload_1
       2: aconst_null
       3: invokespecial #41                 // Method "<init>":(Landroid/content/Context;Landroid/util/AttributeSet;)V
       6: return

  public android.support.design.widget.NavigationView(android.content.Context, android.util.AttributeSet);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: iconst_0
       4: invokespecial #44                 // Method "<init>":(Landroid/content/Context;Landroid/util/AttributeSet;I)V
       7: return

  public android.support.design.widget.NavigationView(android.content.Context, android.util.AttributeSet, int);
    Code:
       0: aload_0
       1: aload_1
       2: aload_2
       3: iload_3
       4: invokespecial #45                 // Method android/support/design/internal/f."<init>":(Landroid/content/Context;Landroid/util/AttributeSet;I)V
       7: aload_0
       8: new           #47                 // class android/support/design/internal/c
      11: dup
      12: invokespecial #49                 // Method android/support/design/internal/c."<init>":()V
      15: putfield      #51                 // Field g:Landroid/support/design/internal/c;
      18: aload_1
      19: invokestatic  #55                 // Method android/support/design/widget/m.a:(Landroid/content/Context;)V
      22: aload_0
      23: new           #57                 // class android/support/design/internal/b
      26: dup
      27: aload_1
      28: invokespecial #59                 // Method android/support/design/internal/b."<init>":(Landroid/content/Context;)V
      31: putfield      #61                 // Field f:Landroid/support/design/internal/b;
      34: aload_1
      35: aload_2
      36: getstatic     #66                 // Field android/support/design/a$j.NavigationView:[I
      39: iload_3
      40: getstatic     #71                 // Field android/support/design/a$i.Widget_Design_NavigationView:I
      43: invokestatic  #76                 // Method android/support/v7/widget/bp.a:(Landroid/content/Context;Landroid/util/AttributeSet;[III)Landroid/support/v7/widget/bp;
      46: astore        7
      48: aload_0
      49: aload         7
      51: getstatic     #79                 // Field android/support/design/a$j.NavigationView_android_background:I
      54: invokevirtual #82                 // Method android/support/v7/widget/bp.a:(I)Landroid/graphics/drawable/Drawable;
      57: invokestatic  #87                 // Method android/support/v4/view/s.a:(Landroid/view/View;Landroid/graphics/drawable/Drawable;)V
      60: aload         7
      62: getstatic     #90                 // Field android/support/design/a$j.NavigationView_elevation:I
      65: invokevirtual #93                 // Method android/support/v7/widget/bp.g:(I)Z
      68: ifeq          85
      71: aload_0
      72: aload         7
      74: getstatic     #90                 // Field android/support/design/a$j.NavigationView_elevation:I
      77: iconst_0
      78: invokevirtual #96                 // Method android/support/v7/widget/bp.e:(II)I
      81: i2f
      82: invokestatic  #99                 // Method android/support/v4/view/s.a:(Landroid/view/View;F)V
      85: aload_0
      86: aload         7
      88: getstatic     #102                // Field android/support/design/a$j.NavigationView_android_fitsSystemWindows:I
      91: iconst_0
      92: invokevirtual #105                // Method android/support/v7/widget/bp.a:(IZ)Z
      95: invokestatic  #108                // Method android/support/v4/view/s.b:(Landroid/view/View;Z)V
      98: aload_0
      99: aload         7
     101: getstatic     #111                // Field android/support/design/a$j.NavigationView_android_maxWidth:I
     104: iconst_0
     105: invokevirtual #96                 // Method android/support/v7/widget/bp.e:(II)I
     108: putfield      #113                // Field h:I
     111: aload         7
     113: getstatic     #116                // Field android/support/design/a$j.NavigationView_itemIconTint:I
     116: invokevirtual #93                 // Method android/support/v7/widget/bp.g:(I)Z
     119: ifeq          135
     122: aload         7
     124: getstatic     #116                // Field android/support/design/a$j.NavigationView_itemIconTint:I
     127: invokevirtual #119                // Method android/support/v7/widget/bp.e:(I)Landroid/content/res/ColorStateList;
     130: astore        5
     132: goto          143
     135: aload_0
     136: ldc           #120                // int 16842808
     138: invokespecial #122                // Method c:(I)Landroid/content/res/ColorStateList;
     141: astore        5
     143: aload         7
     145: getstatic     #125                // Field android/support/design/a$j.NavigationView_itemTextAppearance:I
     148: invokevirtual #93                 // Method android/support/v7/widget/bp.g:(I)Z
     151: ifeq          170
     154: aload         7
     156: getstatic     #125                // Field android/support/design/a$j.NavigationView_itemTextAppearance:I
     159: iconst_0
     160: invokevirtual #127                // Method android/support/v7/widget/bp.g:(II)I
     163: istore        4
     165: iconst_1
     166: istore_3
     167: goto          175
     170: iconst_0
     171: istore_3
     172: iconst_0
     173: istore        4
     175: aconst_null
     176: astore_2
     177: aload         7
     179: getstatic     #130                // Field android/support/design/a$j.NavigationView_itemTextColor:I
     182: invokevirtual #93                 // Method android/support/v7/widget/bp.g:(I)Z
     185: ifeq          197
     188: aload         7
     190: getstatic     #130                // Field android/support/design/a$j.NavigationView_itemTextColor:I
     193: invokevirtual #119                // Method android/support/v7/widget/bp.e:(I)Landroid/content/res/ColorStateList;
     196: astore_2
     197: aload_2
     198: astore        6
     200: iload_3
     201: ifne          219
     204: aload_2
     205: astore        6
     207: aload_2
     208: ifnonnull     219
     211: aload_0
     212: ldc           #131                // int 16842806
     214: invokespecial #122                // Method c:(I)Landroid/content/res/ColorStateList;
     217: astore        6
     219: aload         7
     221: getstatic     #134                // Field android/support/design/a$j.NavigationView_itemBackground:I
     224: invokevirtual #82                 // Method android/support/v7/widget/bp.a:(I)Landroid/graphics/drawable/Drawable;
     227: astore_2
     228: aload_0
     229: getfield      #61                 // Field f:Landroid/support/design/internal/b;
     232: new           #6                  // class android/support/design/widget/NavigationView$1
     235: dup
     236: aload_0
     237: invokespecial #137                // Method android/support/design/widget/NavigationView$1."<init>":(Landroid/support/design/widget/NavigationView;)V
     240: invokevirtual #140                // Method android/support/design/internal/b.a:(Landroid/support/v7/view/menu/h$a;)V
     243: aload_0
     244: getfield      #51                 // Field g:Landroid/support/design/internal/c;
     247: iconst_1
     248: invokevirtual #143                // Method android/support/design/internal/c.a:(I)V
     251: aload_0
     252: getfield      #51                 // Field g:Landroid/support/design/internal/c;
     255: aload_1
     256: aload_0
     257: getfield      #61                 // Field f:Landroid/support/design/internal/b;
     260: invokevirtual #146                // Method android/support/design/internal/c.a:(Landroid/content/Context;Landroid/support/v7/view/menu/h;)V
     263: aload_0
     264: getfield      #51                 // Field g:Landroid/support/design/internal/c;
     267: aload         5
     269: invokevirtual #149                // Method android/support/design/internal/c.a:(Landroid/content/res/ColorStateList;)V
     272: iload_3
     273: ifeq          285
     276: aload_0
     277: getfield      #51                 // Field g:Landroid/support/design/internal/c;
     280: iload         4
     282: invokevirtual #151                // Method android/support/design/internal/c.c:(I)V
     285: aload_0
     286: getfield      #51                 // Field g:Landroid/support/design/internal/c;
     289: aload         6
     291: invokevirtual #153                // Method android/support/design/internal/c.b:(Landroid/content/res/ColorStateList;)V
     294: aload_0
     295: getfield      #51                 // Field g:Landroid/support/design/internal/c;
     298: aload_2
     299: invokevirtual #156                // Method android/support/design/internal/c.a:(Landroid/graphics/drawable/Drawable;)V
     302: aload_0
     303: getfield      #61                 // Field f:Landroid/support/design/internal/b;
     306: aload_0
     307: getfield      #51                 // Field g:Landroid/support/design/internal/c;
     310: invokevirtual #159                // Method android/support/design/internal/b.a:(Landroid/support/v7/view/menu/o;)V
     313: aload_0
     314: aload_0
     315: getfield      #51                 // Field g:Landroid/support/design/internal/c;
     318: aload_0
     319: invokevirtual #162                // Method android/support/design/internal/c.a:(Landroid/view/ViewGroup;)Landroid/support/v7/view/menu/p;
     322: checkcast     #164                // class android/view/View
     325: invokevirtual #168                // Method addView:(Landroid/view/View;)V
     328: aload         7
     330: getstatic     #171                // Field android/support/design/a$j.NavigationView_menu:I
     333: invokevirtual #93                 // Method android/support/v7/widget/bp.g:(I)Z
     336: ifeq          352
     339: aload_0
     340: aload         7
     342: getstatic     #171                // Field android/support/design/a$j.NavigationView_menu:I
     345: iconst_0
     346: invokevirtual #127                // Method android/support/v7/widget/bp.g:(II)I
     349: invokevirtual #172                // Method a:(I)V
     352: aload         7
     354: getstatic     #175                // Field android/support/design/a$j.NavigationView_headerLayout:I
     357: invokevirtual #93                 // Method android/support/v7/widget/bp.g:(I)Z
     360: ifeq          377
     363: aload_0
     364: aload         7
     366: getstatic     #175                // Field android/support/design/a$j.NavigationView_headerLayout:I
     369: iconst_0
     370: invokevirtual #127                // Method android/support/v7/widget/bp.g:(II)I
     373: invokevirtual #178                // Method b:(I)Landroid/view/View;
     376: pop
     377: aload         7
     379: invokevirtual #180                // Method android/support/v7/widget/bp.a:()V
     382: return

  public void a(int);
    Code:
       0: aload_0
       1: getfield      #51                 // Field g:Landroid/support/design/internal/c;
       4: iconst_1
       5: invokevirtual #242                // Method android/support/design/internal/c.b:(Z)V
       8: aload_0
       9: invokespecial #244                // Method getMenuInflater:()Landroid/view/MenuInflater;
      12: iload_1
      13: aload_0
      14: getfield      #61                 // Field f:Landroid/support/design/internal/b;
      17: invokevirtual #250                // Method android/view/MenuInflater.inflate:(ILandroid/view/Menu;)V
      20: aload_0
      21: getfield      #51                 // Field g:Landroid/support/design/internal/c;
      24: iconst_0
      25: invokevirtual #242                // Method android/support/design/internal/c.b:(Z)V
      28: aload_0
      29: getfield      #51                 // Field g:Landroid/support/design/internal/c;
      32: iconst_0
      33: invokevirtual #252                // Method android/support/design/internal/c.a:(Z)V
      36: return

  protected void a(android.support.v4.view.ab);
    Code:
       0: aload_0
       1: getfield      #51                 // Field g:Landroid/support/design/internal/c;
       4: aload_1
       5: invokevirtual #255                // Method android/support/design/internal/c.a:(Landroid/support/v4/view/ab;)V
       8: return

  public android.view.View b(int);
    Code:
       0: aload_0
       1: getfield      #51                 // Field g:Landroid/support/design/internal/c;
       4: iload_1
       5: invokevirtual #256                // Method android/support/design/internal/c.b:(I)Landroid/view/View;
       8: areturn

  public int getHeaderCount();
    Code:
       0: aload_0
       1: getfield      #51                 // Field g:Landroid/support/design/internal/c;
       4: invokevirtual #259                // Method android/support/design/internal/c.d:()I
       7: ireturn

  public android.graphics.drawable.Drawable getItemBackground();
    Code:
       0: aload_0
       1: getfield      #51                 // Field g:Landroid/support/design/internal/c;
       4: invokevirtual #263                // Method android/support/design/internal/c.g:()Landroid/graphics/drawable/Drawable;
       7: areturn

  public android.content.res.ColorStateList getItemIconTintList();
    Code:
       0: aload_0
       1: getfield      #51                 // Field g:Landroid/support/design/internal/c;
       4: invokevirtual #267                // Method android/support/design/internal/c.e:()Landroid/content/res/ColorStateList;
       7: areturn

  public android.content.res.ColorStateList getItemTextColor();
    Code:
       0: aload_0
       1: getfield      #51                 // Field g:Landroid/support/design/internal/c;
       4: invokevirtual #270                // Method android/support/design/internal/c.f:()Landroid/content/res/ColorStateList;
       7: areturn

  public android.view.Menu getMenu();
    Code:
       0: aload_0
       1: getfield      #61                 // Field f:Landroid/support/design/internal/b;
       4: areturn

  protected void onMeasure(int, int);
    Code:
       0: iload_1
       1: invokestatic  #280                // Method android/view/View$MeasureSpec.getMode:(I)I
       4: istore_3
       5: iload_3
       6: ldc_w         #281                // int -2147483648
       9: if_icmpeq     27
      12: iload_3
      13: ifeq          19
      16: goto          47
      19: aload_0
      20: getfield      #113                // Field h:I
      23: istore_1
      24: goto          39
      27: iload_1
      28: invokestatic  #284                // Method android/view/View$MeasureSpec.getSize:(I)I
      31: aload_0
      32: getfield      #113                // Field h:I
      35: invokestatic  #289                // Method java/lang/Math.min:(II)I
      38: istore_1
      39: iload_1
      40: ldc_w         #290                // int 1073741824
      43: invokestatic  #293                // Method android/view/View$MeasureSpec.makeMeasureSpec:(II)I
      46: istore_1
      47: aload_0
      48: iload_1
      49: iload_2
      50: invokespecial #295                // Method android/support/design/internal/f.onMeasure:(II)V
      53: return

  protected void onRestoreInstanceState(android.os.Parcelable);
    Code:
       0: aload_1
       1: instanceof    #11                 // class android/support/design/widget/NavigationView$b
       4: ifne          13
       7: aload_0
       8: aload_1
       9: invokespecial #299                // Method android/support/design/internal/f.onRestoreInstanceState:(Landroid/os/Parcelable;)V
      12: return
      13: aload_1
      14: checkcast     #11                 // class android/support/design/widget/NavigationView$b
      17: astore_1
      18: aload_0
      19: aload_1
      20: invokevirtual #302                // Method android/support/design/widget/NavigationView$b.a:()Landroid/os/Parcelable;
      23: invokespecial #299                // Method android/support/design/internal/f.onRestoreInstanceState:(Landroid/os/Parcelable;)V
      26: aload_0
      27: getfield      #61                 // Field f:Landroid/support/design/internal/b;
      30: aload_1
      31: getfield      #305                // Field android/support/design/widget/NavigationView$b.a:Landroid/os/Bundle;
      34: invokevirtual #308                // Method android/support/design/internal/b.b:(Landroid/os/Bundle;)V
      37: return

  protected android.os.Parcelable onSaveInstanceState();
    Code:
       0: new           #11                 // class android/support/design/widget/NavigationView$b
       3: dup
       4: aload_0
       5: invokespecial #311                // Method android/support/design/internal/f.onSaveInstanceState:()Landroid/os/Parcelable;
       8: invokespecial #313                // Method android/support/design/widget/NavigationView$b."<init>":(Landroid/os/Parcelable;)V
      11: astore_1
      12: aload_1
      13: new           #315                // class android/os/Bundle
      16: dup
      17: invokespecial #316                // Method android/os/Bundle."<init>":()V
      20: putfield      #305                // Field android/support/design/widget/NavigationView$b.a:Landroid/os/Bundle;
      23: aload_0
      24: getfield      #61                 // Field f:Landroid/support/design/internal/b;
      27: aload_1
      28: getfield      #305                // Field android/support/design/widget/NavigationView$b.a:Landroid/os/Bundle;
      31: invokevirtual #318                // Method android/support/design/internal/b.a:(Landroid/os/Bundle;)V
      34: aload_1
      35: areturn

  public void setCheckedItem(int);
    Code:
       0: aload_0
       1: getfield      #61                 // Field f:Landroid/support/design/internal/b;
       4: iload_1
       5: invokevirtual #323                // Method android/support/design/internal/b.findItem:(I)Landroid/view/MenuItem;
       8: astore_2
       9: aload_2
      10: ifnull        24
      13: aload_0
      14: getfield      #51                 // Field g:Landroid/support/design/internal/c;
      17: aload_2
      18: checkcast     #325                // class android/support/v7/view/menu/j
      21: invokevirtual #328                // Method android/support/design/internal/c.a:(Landroid/support/v7/view/menu/j;)V
      24: return

  public void setItemBackground(android.graphics.drawable.Drawable);
    Code:
       0: aload_0
       1: getfield      #51                 // Field g:Landroid/support/design/internal/c;
       4: aload_1
       5: invokevirtual #156                // Method android/support/design/internal/c.a:(Landroid/graphics/drawable/Drawable;)V
       8: return

  public void setItemBackgroundResource(int);
    Code:
       0: aload_0
       1: aload_0
       2: invokevirtual #187                // Method getContext:()Landroid/content/Context;
       5: iload_1
       6: invokestatic  #335                // Method android/support/v4/a/a.a:(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;
       9: invokevirtual #337                // Method setItemBackground:(Landroid/graphics/drawable/Drawable;)V
      12: return

  public void setItemIconTintList(android.content.res.ColorStateList);
    Code:
       0: aload_0
       1: getfield      #51                 // Field g:Landroid/support/design/internal/c;
       4: aload_1
       5: invokevirtual #149                // Method android/support/design/internal/c.a:(Landroid/content/res/ColorStateList;)V
       8: return

  public void setItemTextAppearance(int);
    Code:
       0: aload_0
       1: getfield      #51                 // Field g:Landroid/support/design/internal/c;
       4: iload_1
       5: invokevirtual #151                // Method android/support/design/internal/c.c:(I)V
       8: return

  public void setItemTextColor(android.content.res.ColorStateList);
    Code:
       0: aload_0
       1: getfield      #51                 // Field g:Landroid/support/design/internal/c;
       4: aload_1
       5: invokevirtual #153                // Method android/support/design/internal/c.b:(Landroid/content/res/ColorStateList;)V
       8: return

  public void setNavigationItemSelectedListener(android.support.design.widget.NavigationView$a);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #344                // Field c:Landroid/support/design/widget/NavigationView$a;
       5: return
}
