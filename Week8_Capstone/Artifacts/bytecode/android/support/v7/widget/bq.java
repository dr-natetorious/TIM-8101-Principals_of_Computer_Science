public class android.support.v7.widget.bq implements android.support.v7.widget.al {
  android.support.v7.widget.Toolbar a;

  java.lang.CharSequence b;

  android.view.Window$Callback c;

  boolean d;

  public android.support.v7.widget.bq(android.support.v7.widget.Toolbar, boolean);
    Code:
       0: aload_0
       1: aload_1
       2: iload_2
       3: getstatic     #42                 // Field android/support/v7/a/a$h.abc_action_bar_up_description:I
       6: getstatic     #47                 // Field android/support/v7/a/a$e.abc_ic_ab_back_material:I
       9: invokespecial #50                 // Method "<init>":(Landroid/support/v7/widget/Toolbar;ZII)V
      12: return

  public android.support.v7.widget.bq(android.support.v7.widget.Toolbar, boolean, int, int);
    Code:
       0: aload_0
       1: invokespecial #54                 // Method java/lang/Object."<init>":()V
       4: aload_0
       5: iconst_0
       6: putfield      #56                 // Field o:I
       9: aload_0
      10: iconst_0
      11: putfield      #58                 // Field p:I
      14: aload_0
      15: aload_1
      16: putfield      #60                 // Field a:Landroid/support/v7/widget/Toolbar;
      19: aload_0
      20: aload_1
      21: invokevirtual #66                 // Method android/support/v7/widget/Toolbar.getTitle:()Ljava/lang/CharSequence;
      24: putfield      #68                 // Field b:Ljava/lang/CharSequence;
      27: aload_0
      28: aload_1
      29: invokevirtual #71                 // Method android/support/v7/widget/Toolbar.getSubtitle:()Ljava/lang/CharSequence;
      32: putfield      #73                 // Field l:Ljava/lang/CharSequence;
      35: aload_0
      36: getfield      #68                 // Field b:Ljava/lang/CharSequence;
      39: ifnull        48
      42: iconst_1
      43: istore        6
      45: goto          51
      48: iconst_0
      49: istore        6
      51: aload_0
      52: iload         6
      54: putfield      #75                 // Field k:Z
      57: aload_0
      58: aload_1
      59: invokevirtual #79                 // Method android/support/v7/widget/Toolbar.getNavigationIcon:()Landroid/graphics/drawable/Drawable;
      62: putfield      #81                 // Field j:Landroid/graphics/drawable/Drawable;
      65: aload_1
      66: invokevirtual #85                 // Method android/support/v7/widget/Toolbar.getContext:()Landroid/content/Context;
      69: aconst_null
      70: getstatic     #91                 // Field android/support/v7/a/a$j.ActionBar:[I
      73: getstatic     #96                 // Field android/support/v7/a/a$a.actionBarStyle:I
      76: iconst_0
      77: invokestatic  #101                // Method android/support/v7/widget/bp.a:(Landroid/content/Context;Landroid/util/AttributeSet;[III)Landroid/support/v7/widget/bp;
      80: astore_1
      81: aload_0
      82: aload_1
      83: getstatic     #104                // Field android/support/v7/a/a$j.ActionBar_homeAsUpIndicator:I
      86: invokevirtual #107                // Method android/support/v7/widget/bp.a:(I)Landroid/graphics/drawable/Drawable;
      89: putfield      #109                // Field q:Landroid/graphics/drawable/Drawable;
      92: iload_2
      93: ifeq          444
      96: aload_1
      97: getstatic     #112                // Field android/support/v7/a/a$j.ActionBar_title:I
     100: invokevirtual #115                // Method android/support/v7/widget/bp.c:(I)Ljava/lang/CharSequence;
     103: astore        7
     105: aload         7
     107: invokestatic  #121                // Method android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
     110: ifne          119
     113: aload_0
     114: aload         7
     116: invokevirtual #124                // Method b:(Ljava/lang/CharSequence;)V
     119: aload_1
     120: getstatic     #127                // Field android/support/v7/a/a$j.ActionBar_subtitle:I
     123: invokevirtual #115                // Method android/support/v7/widget/bp.c:(I)Ljava/lang/CharSequence;
     126: astore        7
     128: aload         7
     130: invokestatic  #121                // Method android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
     133: ifne          142
     136: aload_0
     137: aload         7
     139: invokevirtual #129                // Method c:(Ljava/lang/CharSequence;)V
     142: aload_1
     143: getstatic     #132                // Field android/support/v7/a/a$j.ActionBar_logo:I
     146: invokevirtual #107                // Method android/support/v7/widget/bp.a:(I)Landroid/graphics/drawable/Drawable;
     149: astore        7
     151: aload         7
     153: ifnull        162
     156: aload_0
     157: aload         7
     159: invokevirtual #135                // Method c:(Landroid/graphics/drawable/Drawable;)V
     162: aload_1
     163: getstatic     #138                // Field android/support/v7/a/a$j.ActionBar_icon:I
     166: invokevirtual #107                // Method android/support/v7/widget/bp.a:(I)Landroid/graphics/drawable/Drawable;
     169: astore        7
     171: aload         7
     173: ifnull        182
     176: aload_0
     177: aload         7
     179: invokevirtual #140                // Method a:(Landroid/graphics/drawable/Drawable;)V
     182: aload_0
     183: getfield      #81                 // Field j:Landroid/graphics/drawable/Drawable;
     186: ifnonnull     204
     189: aload_0
     190: getfield      #109                // Field q:Landroid/graphics/drawable/Drawable;
     193: ifnull        204
     196: aload_0
     197: aload_0
     198: getfield      #109                // Field q:Landroid/graphics/drawable/Drawable;
     201: invokevirtual #142                // Method b:(Landroid/graphics/drawable/Drawable;)V
     204: aload_0
     205: aload_1
     206: getstatic     #145                // Field android/support/v7/a/a$j.ActionBar_displayOptions:I
     209: iconst_0
     210: invokevirtual #148                // Method android/support/v7/widget/bp.a:(II)I
     213: invokevirtual #151                // Method c:(I)V
     216: aload_1
     217: getstatic     #154                // Field android/support/v7/a/a$j.ActionBar_customNavigationLayout:I
     220: iconst_0
     221: invokevirtual #156                // Method android/support/v7/widget/bp.g:(II)I
     224: istore        4
     226: iload         4
     228: ifeq          266
     231: aload_0
     232: aload_0
     233: getfield      #60                 // Field a:Landroid/support/v7/widget/Toolbar;
     236: invokevirtual #85                 // Method android/support/v7/widget/Toolbar.getContext:()Landroid/content/Context;
     239: invokestatic  #162                // Method android/view/LayoutInflater.from:(Landroid/content/Context;)Landroid/view/LayoutInflater;
     242: iload         4
     244: aload_0
     245: getfield      #60                 // Field a:Landroid/support/v7/widget/Toolbar;
     248: iconst_0
     249: invokevirtual #166                // Method android/view/LayoutInflater.inflate:(ILandroid/view/ViewGroup;Z)Landroid/view/View;
     252: invokevirtual #169                // Method a:(Landroid/view/View;)V
     255: aload_0
     256: aload_0
     257: getfield      #171                // Field e:I
     260: bipush        16
     262: ior
     263: invokevirtual #151                // Method c:(I)V
     266: aload_1
     267: getstatic     #174                // Field android/support/v7/a/a$j.ActionBar_height:I
     270: iconst_0
     271: invokevirtual #176                // Method android/support/v7/widget/bp.f:(II)I
     274: istore        4
     276: iload         4
     278: ifle          306
     281: aload_0
     282: getfield      #60                 // Field a:Landroid/support/v7/widget/Toolbar;
     285: invokevirtual #180                // Method android/support/v7/widget/Toolbar.getLayoutParams:()Landroid/view/ViewGroup$LayoutParams;
     288: astore        7
     290: aload         7
     292: iload         4
     294: putfield      #185                // Field android/view/ViewGroup$LayoutParams.height:I
     297: aload_0
     298: getfield      #60                 // Field a:Landroid/support/v7/widget/Toolbar;
     301: aload         7
     303: invokevirtual #189                // Method android/support/v7/widget/Toolbar.setLayoutParams:(Landroid/view/ViewGroup$LayoutParams;)V
     306: aload_1
     307: getstatic     #192                // Field android/support/v7/a/a$j.ActionBar_contentInsetStart:I
     310: iconst_m1
     311: invokevirtual #194                // Method android/support/v7/widget/bp.d:(II)I
     314: istore        4
     316: aload_1
     317: getstatic     #197                // Field android/support/v7/a/a$j.ActionBar_contentInsetEnd:I
     320: iconst_m1
     321: invokevirtual #194                // Method android/support/v7/widget/bp.d:(II)I
     324: istore        5
     326: iload         4
     328: ifge          336
     331: iload         5
     333: iflt          355
     336: aload_0
     337: getfield      #60                 // Field a:Landroid/support/v7/widget/Toolbar;
     340: iload         4
     342: iconst_0
     343: invokestatic  #202                // Method java/lang/Math.max:(II)I
     346: iload         5
     348: iconst_0
     349: invokestatic  #202                // Method java/lang/Math.max:(II)I
     352: invokevirtual #205                // Method android/support/v7/widget/Toolbar.a:(II)V
     355: aload_1
     356: getstatic     #208                // Field android/support/v7/a/a$j.ActionBar_titleTextStyle:I
     359: iconst_0
     360: invokevirtual #156                // Method android/support/v7/widget/bp.g:(II)I
     363: istore        4
     365: iload         4
     367: ifeq          386
     370: aload_0
     371: getfield      #60                 // Field a:Landroid/support/v7/widget/Toolbar;
     374: aload_0
     375: getfield      #60                 // Field a:Landroid/support/v7/widget/Toolbar;
     378: invokevirtual #85                 // Method android/support/v7/widget/Toolbar.getContext:()Landroid/content/Context;
     381: iload         4
     383: invokevirtual #211                // Method android/support/v7/widget/Toolbar.a:(Landroid/content/Context;I)V
     386: aload_1
     387: getstatic     #214                // Field android/support/v7/a/a$j.ActionBar_subtitleTextStyle:I
     390: iconst_0
     391: invokevirtual #156                // Method android/support/v7/widget/bp.g:(II)I
     394: istore        4
     396: iload         4
     398: ifeq          417
     401: aload_0
     402: getfield      #60                 // Field a:Landroid/support/v7/widget/Toolbar;
     405: aload_0
     406: getfield      #60                 // Field a:Landroid/support/v7/widget/Toolbar;
     409: invokevirtual #85                 // Method android/support/v7/widget/Toolbar.getContext:()Landroid/content/Context;
     412: iload         4
     414: invokevirtual #216                // Method android/support/v7/widget/Toolbar.b:(Landroid/content/Context;I)V
     417: aload_1
     418: getstatic     #219                // Field android/support/v7/a/a$j.ActionBar_popupTheme:I
     421: iconst_0
     422: invokevirtual #156                // Method android/support/v7/widget/bp.g:(II)I
     425: istore        4
     427: iload         4
     429: ifeq          452
     432: aload_0
     433: getfield      #60                 // Field a:Landroid/support/v7/widget/Toolbar;
     436: iload         4
     438: invokevirtual #222                // Method android/support/v7/widget/Toolbar.setPopupTheme:(I)V
     441: goto          452
     444: aload_0
     445: aload_0
     446: invokespecial #226                // Method r:()I
     449: putfield      #171                // Field e:I
     452: aload_1
     453: invokevirtual #228                // Method android/support/v7/widget/bp.a:()V
     456: aload_0
     457: iload_3
     458: invokevirtual #230                // Method g:(I)V
     461: aload_0
     462: aload_0
     463: getfield      #60                 // Field a:Landroid/support/v7/widget/Toolbar;
     466: invokevirtual #233                // Method android/support/v7/widget/Toolbar.getNavigationContentDescription:()Ljava/lang/CharSequence;
     469: putfield      #235                // Field m:Ljava/lang/CharSequence;
     472: aload_0
     473: getfield      #60                 // Field a:Landroid/support/v7/widget/Toolbar;
     476: new           #8                  // class android/support/v7/widget/bq$1
     479: dup
     480: aload_0
     481: invokespecial #238                // Method android/support/v7/widget/bq$1."<init>":(Landroid/support/v7/widget/bq;)V
     484: invokevirtual #242                // Method android/support/v7/widget/Toolbar.setNavigationOnClickListener:(Landroid/view/View$OnClickListener;)V
     487: return

  public android.support.v4.view.x a(int, long);
    Code:
       0: aload_0
       1: getfield      #60                 // Field a:Landroid/support/v7/widget/Toolbar;
       4: invokestatic  #269                // Method android/support/v4/view/s.k:(Landroid/view/View;)Landroid/support/v4/view/x;
       7: astore        5
       9: iload_1
      10: ifne          19
      13: fconst_1
      14: fstore        4
      16: goto          22
      19: fconst_0
      20: fstore        4
      22: aload         5
      24: fload         4
      26: invokevirtual #274                // Method android/support/v4/view/x.a:(F)Landroid/support/v4/view/x;
      29: lload_2
      30: invokevirtual #277                // Method android/support/v4/view/x.a:(J)Landroid/support/v4/view/x;
      33: new           #10                 // class android/support/v7/widget/bq$2
      36: dup
      37: aload_0
      38: iload_1
      39: invokespecial #280                // Method android/support/v7/widget/bq$2."<init>":(Landroid/support/v7/widget/bq;I)V
      42: invokevirtual #283                // Method android/support/v4/view/x.a:(Landroid/support/v4/view/y;)Landroid/support/v4/view/x;
      45: areturn

  public android.view.ViewGroup a();
    Code:
       0: aload_0
       1: getfield      #60                 // Field a:Landroid/support/v7/widget/Toolbar;
       4: areturn

  public void a(int);
    Code:
       0: iload_1
       1: ifeq          16
       4: aload_0
       5: invokevirtual #286                // Method b:()Landroid/content/Context;
       8: iload_1
       9: invokestatic  #291                // Method android/support/v7/c/a/b.b:(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;
      12: astore_2
      13: goto          18
      16: aconst_null
      17: astore_2
      18: aload_0
      19: aload_2
      20: invokevirtual #140                // Method a:(Landroid/graphics/drawable/Drawable;)V
      23: return

  public void a(android.graphics.drawable.Drawable);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #250                // Field h:Landroid/graphics/drawable/Drawable;
       5: aload_0
       6: invokespecial #293                // Method s:()V
       9: return

  public void a(android.support.v7.view.menu.o$a, android.support.v7.view.menu.h$a);
    Code:
       0: aload_0
       1: getfield      #60                 // Field a:Landroid/support/v7/widget/Toolbar;
       4: aload_1
       5: aload_2
       6: invokevirtual #296                // Method android/support/v7/widget/Toolbar.a:(Landroid/support/v7/view/menu/o$a;Landroid/support/v7/view/menu/h$a;)V
       9: return

  public void a(android.support.v7.widget.bh);
    Code:
       0: aload_0
       1: getfield      #299                // Field f:Landroid/view/View;
       4: ifnull        32
       7: aload_0
       8: getfield      #299                // Field f:Landroid/view/View;
      11: invokevirtual #305                // Method android/view/View.getParent:()Landroid/view/ViewParent;
      14: aload_0
      15: getfield      #60                 // Field a:Landroid/support/v7/widget/Toolbar;
      18: if_acmpne     32
      21: aload_0
      22: getfield      #60                 // Field a:Landroid/support/v7/widget/Toolbar;
      25: aload_0
      26: getfield      #299                // Field f:Landroid/view/View;
      29: invokevirtual #308                // Method android/support/v7/widget/Toolbar.removeView:(Landroid/view/View;)V
      32: aload_0
      33: aload_1
      34: putfield      #299                // Field f:Landroid/view/View;
      37: aload_1
      38: ifnull        96
      41: aload_0
      42: getfield      #56                 // Field o:I
      45: iconst_2
      46: if_icmpne     96
      49: aload_0
      50: getfield      #60                 // Field a:Landroid/support/v7/widget/Toolbar;
      53: aload_0
      54: getfield      #299                // Field f:Landroid/view/View;
      57: iconst_0
      58: invokevirtual #312                // Method android/support/v7/widget/Toolbar.addView:(Landroid/view/View;I)V
      61: aload_0
      62: getfield      #299                // Field f:Landroid/view/View;
      65: invokevirtual #313                // Method android/view/View.getLayoutParams:()Landroid/view/ViewGroup$LayoutParams;
      68: checkcast     #315                // class android/support/v7/widget/Toolbar$b
      71: astore_2
      72: aload_2
      73: bipush        -2
      75: putfield      #318                // Field android/support/v7/widget/Toolbar$b.width:I
      78: aload_2
      79: bipush        -2
      81: putfield      #319                // Field android/support/v7/widget/Toolbar$b.height:I
      84: aload_2
      85: ldc_w         #320                // int 8388691
      88: putfield      #322                // Field android/support/v7/widget/Toolbar$b.a:I
      91: aload_1
      92: iconst_1
      93: invokevirtual #328                // Method android/support/v7/widget/bh.setAllowCollapse:(Z)V
      96: return

  public void a(android.view.Menu, android.support.v7.view.menu.o$a);
    Code:
       0: aload_0
       1: getfield      #331                // Field n:Landroid/support/v7/widget/d;
       4: ifnonnull     35
       7: aload_0
       8: new           #333                // class android/support/v7/widget/d
      11: dup
      12: aload_0
      13: getfield      #60                 // Field a:Landroid/support/v7/widget/Toolbar;
      16: invokevirtual #85                 // Method android/support/v7/widget/Toolbar.getContext:()Landroid/content/Context;
      19: invokespecial #336                // Method android/support/v7/widget/d."<init>":(Landroid/content/Context;)V
      22: putfield      #331                // Field n:Landroid/support/v7/widget/d;
      25: aload_0
      26: getfield      #331                // Field n:Landroid/support/v7/widget/d;
      29: getstatic     #341                // Field android/support/v7/a/a$f.action_menu_presenter:I
      32: invokevirtual #343                // Method android/support/v7/widget/d.a:(I)V
      35: aload_0
      36: getfield      #331                // Field n:Landroid/support/v7/widget/d;
      39: aload_2
      40: invokevirtual #346                // Method android/support/v7/widget/d.a:(Landroid/support/v7/view/menu/o$a;)V
      43: aload_0
      44: getfield      #60                 // Field a:Landroid/support/v7/widget/Toolbar;
      47: aload_1
      48: checkcast     #348                // class android/support/v7/view/menu/h
      51: aload_0
      52: getfield      #331                // Field n:Landroid/support/v7/widget/d;
      55: invokevirtual #351                // Method android/support/v7/widget/Toolbar.a:(Landroid/support/v7/view/menu/h;Landroid/support/v7/widget/d;)V
      58: return

  public void a(android.view.View);
    Code:
       0: aload_0
       1: getfield      #353                // Field g:Landroid/view/View;
       4: ifnull        28
       7: aload_0
       8: getfield      #171                // Field e:I
      11: bipush        16
      13: iand
      14: ifeq          28
      17: aload_0
      18: getfield      #60                 // Field a:Landroid/support/v7/widget/Toolbar;
      21: aload_0
      22: getfield      #353                // Field g:Landroid/view/View;
      25: invokevirtual #308                // Method android/support/v7/widget/Toolbar.removeView:(Landroid/view/View;)V
      28: aload_0
      29: aload_1
      30: putfield      #353                // Field g:Landroid/view/View;
      33: aload_1
      34: ifnull        58
      37: aload_0
      38: getfield      #171                // Field e:I
      41: bipush        16
      43: iand
      44: ifeq          58
      47: aload_0
      48: getfield      #60                 // Field a:Landroid/support/v7/widget/Toolbar;
      51: aload_0
      52: getfield      #353                // Field g:Landroid/view/View;
      55: invokevirtual #355                // Method android/support/v7/widget/Toolbar.addView:(Landroid/view/View;)V
      58: return

  public void a(android.view.Window$Callback);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #358                // Field c:Landroid/view/Window$Callback;
       5: return

  public void a(java.lang.CharSequence);
    Code:
       0: aload_0
       1: getfield      #75                 // Field k:Z
       4: ifne          12
       7: aload_0
       8: aload_1
       9: invokespecial #360                // Method e:(Ljava/lang/CharSequence;)V
      12: return

  public void a(boolean);
    Code:
       0: aload_0
       1: getfield      #60                 // Field a:Landroid/support/v7/widget/Toolbar;
       4: iload_1
       5: invokevirtual #363                // Method android/support/v7/widget/Toolbar.setCollapsible:(Z)V
       8: return

  public android.content.Context b();
    Code:
       0: aload_0
       1: getfield      #60                 // Field a:Landroid/support/v7/widget/Toolbar;
       4: invokevirtual #85                 // Method android/support/v7/widget/Toolbar.getContext:()Landroid/content/Context;
       7: areturn

  public void b(int);
    Code:
       0: iload_1
       1: ifeq          16
       4: aload_0
       5: invokevirtual #286                // Method b:()Landroid/content/Context;
       8: iload_1
       9: invokestatic  #291                // Method android/support/v7/c/a/b.b:(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;
      12: astore_2
      13: goto          18
      16: aconst_null
      17: astore_2
      18: aload_0
      19: aload_2
      20: invokevirtual #135                // Method c:(Landroid/graphics/drawable/Drawable;)V
      23: return

  public void b(android.graphics.drawable.Drawable);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #81                 // Field j:Landroid/graphics/drawable/Drawable;
       5: aload_0
       6: invokespecial #365                // Method t:()V
       9: return

  public void b(java.lang.CharSequence);
    Code:
       0: aload_0
       1: iconst_1
       2: putfield      #75                 // Field k:Z
       5: aload_0
       6: aload_1
       7: invokespecial #360                // Method e:(Ljava/lang/CharSequence;)V
      10: return

  public void b(boolean);
    Code:
       0: return

  public void c(int);
    Code:
       0: aload_0
       1: getfield      #171                // Field e:I
       4: iload_1
       5: ixor
       6: istore_2
       7: aload_0
       8: iload_1
       9: putfield      #171                // Field e:I
      12: iload_2
      13: ifeq          156
      16: iload_2
      17: iconst_4
      18: iand
      19: ifeq          36
      22: iload_1
      23: iconst_4
      24: iand
      25: ifeq          32
      28: aload_0
      29: invokespecial #367                // Method u:()V
      32: aload_0
      33: invokespecial #365                // Method t:()V
      36: iload_2
      37: iconst_3
      38: iand
      39: ifeq          46
      42: aload_0
      43: invokespecial #293                // Method s:()V
      46: iload_2
      47: bipush        8
      49: iand
      50: ifeq          112
      53: iload_1
      54: bipush        8
      56: iand
      57: ifeq          91
      60: aload_0
      61: getfield      #60                 // Field a:Landroid/support/v7/widget/Toolbar;
      64: aload_0
      65: getfield      #68                 // Field b:Ljava/lang/CharSequence;
      68: invokevirtual #245                // Method android/support/v7/widget/Toolbar.setTitle:(Ljava/lang/CharSequence;)V
      71: aload_0
      72: getfield      #60                 // Field a:Landroid/support/v7/widget/Toolbar;
      75: astore_3
      76: aload_0
      77: getfield      #73                 // Field l:Ljava/lang/CharSequence;
      80: astore        4
      82: aload_3
      83: aload         4
      85: invokevirtual #370                // Method android/support/v7/widget/Toolbar.setSubtitle:(Ljava/lang/CharSequence;)V
      88: goto          112
      91: aload_0
      92: getfield      #60                 // Field a:Landroid/support/v7/widget/Toolbar;
      95: astore_3
      96: aconst_null
      97: astore        4
      99: aload_3
     100: aconst_null
     101: invokevirtual #245                // Method android/support/v7/widget/Toolbar.setTitle:(Ljava/lang/CharSequence;)V
     104: aload_0
     105: getfield      #60                 // Field a:Landroid/support/v7/widget/Toolbar;
     108: astore_3
     109: goto          82
     112: iload_2
     113: bipush        16
     115: iand
     116: ifeq          156
     119: aload_0
     120: getfield      #353                // Field g:Landroid/view/View;
     123: ifnull        156
     126: iload_1
     127: bipush        16
     129: iand
     130: ifeq          145
     133: aload_0
     134: getfield      #60                 // Field a:Landroid/support/v7/widget/Toolbar;
     137: aload_0
     138: getfield      #353                // Field g:Landroid/view/View;
     141: invokevirtual #355                // Method android/support/v7/widget/Toolbar.addView:(Landroid/view/View;)V
     144: return
     145: aload_0
     146: getfield      #60                 // Field a:Landroid/support/v7/widget/Toolbar;
     149: aload_0
     150: getfield      #353                // Field g:Landroid/view/View;
     153: invokevirtual #308                // Method android/support/v7/widget/Toolbar.removeView:(Landroid/view/View;)V
     156: return

  public void c(android.graphics.drawable.Drawable);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #248                // Field i:Landroid/graphics/drawable/Drawable;
       5: aload_0
       6: invokespecial #293                // Method s:()V
       9: return

  public void c(java.lang.CharSequence);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #73                 // Field l:Ljava/lang/CharSequence;
       5: aload_0
       6: getfield      #171                // Field e:I
       9: bipush        8
      11: iand
      12: ifeq          23
      15: aload_0
      16: getfield      #60                 // Field a:Landroid/support/v7/widget/Toolbar;
      19: aload_1
      20: invokevirtual #370                // Method android/support/v7/widget/Toolbar.setSubtitle:(Ljava/lang/CharSequence;)V
      23: return

  public boolean c();
    Code:
       0: aload_0
       1: getfield      #60                 // Field a:Landroid/support/v7/widget/Toolbar;
       4: invokevirtual #373                // Method android/support/v7/widget/Toolbar.g:()Z
       7: ireturn

  public void d();
    Code:
       0: aload_0
       1: getfield      #60                 // Field a:Landroid/support/v7/widget/Toolbar;
       4: invokevirtual #375                // Method android/support/v7/widget/Toolbar.h:()V
       7: return

  public void d(int);
    Code:
       0: iload_1
       1: ifeq          16
       4: aload_0
       5: invokevirtual #286                // Method b:()Landroid/content/Context;
       8: iload_1
       9: invokestatic  #291                // Method android/support/v7/c/a/b.b:(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;
      12: astore_2
      13: goto          18
      16: aconst_null
      17: astore_2
      18: aload_0
      19: aload_2
      20: invokevirtual #142                // Method b:(Landroid/graphics/drawable/Drawable;)V
      23: return

  public void d(java.lang.CharSequence);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #235                // Field m:Ljava/lang/CharSequence;
       5: aload_0
       6: invokespecial #367                // Method u:()V
       9: return

  public java.lang.CharSequence e();
    Code:
       0: aload_0
       1: getfield      #60                 // Field a:Landroid/support/v7/widget/Toolbar;
       4: invokevirtual #66                 // Method android/support/v7/widget/Toolbar.getTitle:()Ljava/lang/CharSequence;
       7: areturn

  public void e(int);
    Code:
       0: iload_1
       1: ifne          9
       4: aconst_null
       5: astore_2
       6: goto          18
       9: aload_0
      10: invokevirtual #286                // Method b:()Landroid/content/Context;
      13: iload_1
      14: invokevirtual #381                // Method android/content/Context.getString:(I)Ljava/lang/String;
      17: astore_2
      18: aload_0
      19: aload_2
      20: invokevirtual #383                // Method d:(Ljava/lang/CharSequence;)V
      23: return

  public void f();
    Code:
       0: ldc_w         #385                // String ToolbarWidgetWrapper
       3: ldc_w         #387                // String Progress display unsupported
       6: invokestatic  #392                // Method android/util/Log.i:(Ljava/lang/String;Ljava/lang/String;)I
       9: pop
      10: return

  public void f(int);
    Code:
       0: aload_0
       1: getfield      #60                 // Field a:Landroid/support/v7/widget/Toolbar;
       4: iload_1
       5: invokevirtual #395                // Method android/support/v7/widget/Toolbar.setVisibility:(I)V
       8: return

  public void g();
    Code:
       0: ldc_w         #385                // String ToolbarWidgetWrapper
       3: ldc_w         #387                // String Progress display unsupported
       6: invokestatic  #392                // Method android/util/Log.i:(Ljava/lang/String;Ljava/lang/String;)I
       9: pop
      10: return

  public void g(int);
    Code:
       0: iload_1
       1: aload_0
       2: getfield      #58                 // Field p:I
       5: if_icmpne     9
       8: return
       9: aload_0
      10: iload_1
      11: putfield      #58                 // Field p:I
      14: aload_0
      15: getfield      #60                 // Field a:Landroid/support/v7/widget/Toolbar;
      18: invokevirtual #233                // Method android/support/v7/widget/Toolbar.getNavigationContentDescription:()Ljava/lang/CharSequence;
      21: invokestatic  #121                // Method android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
      24: ifeq          35
      27: aload_0
      28: aload_0
      29: getfield      #58                 // Field p:I
      32: invokevirtual #397                // Method e:(I)V
      35: return

  public boolean h();
    Code:
       0: aload_0
       1: getfield      #60                 // Field a:Landroid/support/v7/widget/Toolbar;
       4: invokevirtual #399                // Method android/support/v7/widget/Toolbar.a:()Z
       7: ireturn

  public boolean i();
    Code:
       0: aload_0
       1: getfield      #60                 // Field a:Landroid/support/v7/widget/Toolbar;
       4: invokevirtual #401                // Method android/support/v7/widget/Toolbar.b:()Z
       7: ireturn

  public boolean j();
    Code:
       0: aload_0
       1: getfield      #60                 // Field a:Landroid/support/v7/widget/Toolbar;
       4: invokevirtual #403                // Method android/support/v7/widget/Toolbar.c:()Z
       7: ireturn

  public boolean k();
    Code:
       0: aload_0
       1: getfield      #60                 // Field a:Landroid/support/v7/widget/Toolbar;
       4: invokevirtual #405                // Method android/support/v7/widget/Toolbar.d:()Z
       7: ireturn

  public boolean l();
    Code:
       0: aload_0
       1: getfield      #60                 // Field a:Landroid/support/v7/widget/Toolbar;
       4: invokevirtual #407                // Method android/support/v7/widget/Toolbar.e:()Z
       7: ireturn

  public void m();
    Code:
       0: aload_0
       1: iconst_1
       2: putfield      #409                // Field d:Z
       5: return

  public void n();
    Code:
       0: aload_0
       1: getfield      #60                 // Field a:Landroid/support/v7/widget/Toolbar;
       4: invokevirtual #411                // Method android/support/v7/widget/Toolbar.f:()V
       7: return

  public int o();
    Code:
       0: aload_0
       1: getfield      #171                // Field e:I
       4: ireturn

  public int p();
    Code:
       0: aload_0
       1: getfield      #56                 // Field o:I
       4: ireturn

  public android.view.Menu q();
    Code:
       0: aload_0
       1: getfield      #60                 // Field a:Landroid/support/v7/widget/Toolbar;
       4: invokevirtual #415                // Method android/support/v7/widget/Toolbar.getMenu:()Landroid/view/Menu;
       7: areturn
}
