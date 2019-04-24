class android.support.v7.view.g$b {
  android.support.v4.view.c a;

  final android.support.v7.view.g b;

  public android.support.v7.view.g$b(android.support.v7.view.g, android.view.Menu);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #51                 // Field b:Landroid/support/v7/view/g;
       5: aload_0
       6: invokespecial #54                 // Method java/lang/Object."<init>":()V
       9: aload_0
      10: aconst_null
      11: putfield      #56                 // Field E:Landroid/content/res/ColorStateList;
      14: aload_0
      15: aconst_null
      16: putfield      #58                 // Field F:Landroid/graphics/PorterDuff$Mode;
      19: aload_0
      20: aload_2
      21: putfield      #60                 // Field c:Landroid/view/Menu;
      24: aload_0
      25: invokevirtual #62                 // Method a:()V
      28: return

  public void a();
    Code:
       0: aload_0
       1: iconst_0
       2: putfield      #262                // Field d:I
       5: aload_0
       6: iconst_0
       7: putfield      #264                // Field e:I
      10: aload_0
      11: iconst_0
      12: putfield      #266                // Field f:I
      15: aload_0
      16: iconst_0
      17: putfield      #268                // Field g:I
      20: aload_0
      21: iconst_1
      22: putfield      #270                // Field h:Z
      25: aload_0
      26: iconst_1
      27: putfield      #272                // Field i:Z
      30: return

  public void a(android.util.AttributeSet);
    Code:
       0: aload_0
       1: getfield      #51                 // Field b:Landroid/support/v7/view/g;
       4: getfield      #76                 // Field android/support/v7/view/g.e:Landroid/content/Context;
       7: aload_1
       8: getstatic     #279                // Field android/support/v7/a/a$j.MenuGroup:[I
      11: invokevirtual #283                // Method android/content/Context.obtainStyledAttributes:(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;
      14: astore_1
      15: aload_0
      16: aload_1
      17: getstatic     #286                // Field android/support/v7/a/a$j.MenuGroup_android_id:I
      20: iconst_0
      21: invokevirtual #292                // Method android/content/res/TypedArray.getResourceId:(II)I
      24: putfield      #262                // Field d:I
      27: aload_0
      28: aload_1
      29: getstatic     #295                // Field android/support/v7/a/a$j.MenuGroup_android_menuCategory:I
      32: iconst_0
      33: invokevirtual #298                // Method android/content/res/TypedArray.getInt:(II)I
      36: putfield      #264                // Field e:I
      39: aload_0
      40: aload_1
      41: getstatic     #301                // Field android/support/v7/a/a$j.MenuGroup_android_orderInCategory:I
      44: iconst_0
      45: invokevirtual #298                // Method android/content/res/TypedArray.getInt:(II)I
      48: putfield      #266                // Field f:I
      51: aload_0
      52: aload_1
      53: getstatic     #304                // Field android/support/v7/a/a$j.MenuGroup_android_checkableBehavior:I
      56: iconst_0
      57: invokevirtual #298                // Method android/content/res/TypedArray.getInt:(II)I
      60: putfield      #268                // Field g:I
      63: aload_0
      64: aload_1
      65: getstatic     #307                // Field android/support/v7/a/a$j.MenuGroup_android_visible:I
      68: iconst_1
      69: invokevirtual #311                // Method android/content/res/TypedArray.getBoolean:(IZ)Z
      72: putfield      #270                // Field h:Z
      75: aload_0
      76: aload_1
      77: getstatic     #314                // Field android/support/v7/a/a$j.MenuGroup_android_enabled:I
      80: iconst_1
      81: invokevirtual #311                // Method android/content/res/TypedArray.getBoolean:(IZ)Z
      84: putfield      #272                // Field i:Z
      87: aload_1
      88: invokevirtual #317                // Method android/content/res/TypedArray.recycle:()V
      91: return

  public void b();
    Code:
       0: aload_0
       1: iconst_1
       2: putfield      #319                // Field j:Z
       5: aload_0
       6: aload_0
       7: getfield      #60                 // Field c:Landroid/view/Menu;
      10: aload_0
      11: getfield      #262                // Field d:I
      14: aload_0
      15: getfield      #321                // Field k:I
      18: aload_0
      19: getfield      #323                // Field l:I
      22: aload_0
      23: getfield      #325                // Field m:Ljava/lang/CharSequence;
      26: invokeinterface #331,  5          // InterfaceMethod android/view/Menu.add:(IIILjava/lang/CharSequence;)Landroid/view/MenuItem;
      31: invokespecial #333                // Method a:(Landroid/view/MenuItem;)V
      34: return

  public void b(android.util.AttributeSet);
    Code:
       0: new           #335                // class java/lang/RuntimeException
       3: dup
       4: ldc_w         #337                // String d2j fail translate: java.lang.RuntimeException: can not merge Z and I\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n
       7: invokespecial #340                // Method java/lang/Runtime."<init>":(Ljava/lang/String;)V
      10: athrow

  public android.view.SubMenu c();
    Code:
       0: aload_0
       1: iconst_1
       2: putfield      #319                // Field j:Z
       5: aload_0
       6: getfield      #60                 // Field c:Landroid/view/Menu;
       9: aload_0
      10: getfield      #262                // Field d:I
      13: aload_0
      14: getfield      #321                // Field k:I
      17: aload_0
      18: getfield      #323                // Field l:I
      21: aload_0
      22: getfield      #325                // Field m:Ljava/lang/CharSequence;
      25: invokeinterface #345,  5          // InterfaceMethod android/view/Menu.addSubMenu:(IIILjava/lang/CharSequence;)Landroid/view/SubMenu;
      30: astore_1
      31: aload_0
      32: aload_1
      33: invokeinterface #351,  1          // InterfaceMethod android/view/SubMenu.getItem:()Landroid/view/MenuItem;
      38: invokespecial #333                // Method a:(Landroid/view/MenuItem;)V
      41: aload_1
      42: areturn

  public boolean d();
    Code:
       0: aload_0
       1: getfield      #319                // Field j:Z
       4: ireturn
}
