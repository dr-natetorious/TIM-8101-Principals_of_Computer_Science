class android.support.v7.widget.bt {
  android.support.v7.widget.bt(android.content.Context);
    Code:
       0: aload_0
       1: invokespecial #22                 // Method java/lang/Object."<init>":()V
       4: aload_0
       5: new           #24                 // class android/view/WindowManager$LayoutParams
       8: dup
       9: invokespecial #25                 // Method android/view/WindowManager$LayoutParams."<init>":()V
      12: putfield      #27                 // Field d:Landroid/view/WindowManager$LayoutParams;
      15: aload_0
      16: new           #29                 // class android/graphics/Rect
      19: dup
      20: invokespecial #30                 // Method android/graphics/Rect."<init>":()V
      23: putfield      #32                 // Field e:Landroid/graphics/Rect;
      26: aload_0
      27: iconst_2
      28: newarray       int
      30: putfield      #34                 // Field f:[I
      33: aload_0
      34: iconst_2
      35: newarray       int
      37: putfield      #36                 // Field g:[I
      40: aload_0
      41: aload_1
      42: putfield      #38                 // Field a:Landroid/content/Context;
      45: aload_0
      46: aload_0
      47: getfield      #38                 // Field a:Landroid/content/Context;
      50: invokestatic  #44                 // Method android/view/LayoutInflater.from:(Landroid/content/Context;)Landroid/view/LayoutInflater;
      53: getstatic     #50                 // Field android/support/v7/a/a$g.abc_tooltip:I
      56: aconst_null
      57: invokevirtual #54                 // Method android/view/LayoutInflater.inflate:(ILandroid/view/ViewGroup;)Landroid/view/View;
      60: putfield      #56                 // Field b:Landroid/view/View;
      63: aload_0
      64: aload_0
      65: getfield      #56                 // Field b:Landroid/view/View;
      68: getstatic     #61                 // Field android/support/v7/a/a$f.message:I
      71: invokevirtual #67                 // Method android/view/View.findViewById:(I)Landroid/view/View;
      74: checkcast     #69                 // class android/widget/TextView
      77: putfield      #71                 // Field c:Landroid/widget/TextView;
      80: aload_0
      81: getfield      #27                 // Field d:Landroid/view/WindowManager$LayoutParams;
      84: aload_0
      85: invokevirtual #75                 // Method java/lang/Object.getClass:()Ljava/lang/Class;
      88: invokevirtual #81                 // Method java/lang/Class.getSimpleName:()Ljava/lang/String;
      91: invokevirtual #85                 // Method android/view/WindowManager$LayoutParams.setTitle:(Ljava/lang/CharSequence;)V
      94: aload_0
      95: getfield      #27                 // Field d:Landroid/view/WindowManager$LayoutParams;
      98: aload_0
      99: getfield      #38                 // Field a:Landroid/content/Context;
     102: invokevirtual #90                 // Method android/content/Context.getPackageName:()Ljava/lang/String;
     105: putfield      #94                 // Field android/view/WindowManager$LayoutParams.packageName:Ljava/lang/String;
     108: aload_0
     109: getfield      #27                 // Field d:Landroid/view/WindowManager$LayoutParams;
     112: sipush        1002
     115: putfield      #97                 // Field android/view/WindowManager$LayoutParams.type:I
     118: aload_0
     119: getfield      #27                 // Field d:Landroid/view/WindowManager$LayoutParams;
     122: bipush        -2
     124: putfield      #100                // Field android/view/WindowManager$LayoutParams.width:I
     127: aload_0
     128: getfield      #27                 // Field d:Landroid/view/WindowManager$LayoutParams;
     131: bipush        -2
     133: putfield      #103                // Field android/view/WindowManager$LayoutParams.height:I
     136: aload_0
     137: getfield      #27                 // Field d:Landroid/view/WindowManager$LayoutParams;
     140: bipush        -3
     142: putfield      #106                // Field android/view/WindowManager$LayoutParams.format:I
     145: aload_0
     146: getfield      #27                 // Field d:Landroid/view/WindowManager$LayoutParams;
     149: getstatic     #111                // Field android/support/v7/a/a$i.Animation_AppCompat_Tooltip:I
     152: putfield      #114                // Field android/view/WindowManager$LayoutParams.windowAnimations:I
     155: aload_0
     156: getfield      #27                 // Field d:Landroid/view/WindowManager$LayoutParams;
     159: bipush        24
     161: putfield      #117                // Field android/view/WindowManager$LayoutParams.flags:I
     164: return

  void a();
    Code:
       0: aload_0
       1: invokevirtual #268                // Method b:()Z
       4: ifne          8
       7: return
       8: aload_0
       9: getfield      #38                 // Field a:Landroid/content/Context;
      12: ldc_w         #270                // String window
      15: invokevirtual #274                // Method android/content/Context.getSystemService:(Ljava/lang/String;)Ljava/lang/Object;
      18: checkcast     #276                // class android/view/WindowManager
      21: aload_0
      22: getfield      #56                 // Field b:Landroid/view/View;
      25: invokeinterface #280,  2          // InterfaceMethod android/view/WindowManager.removeView:(Landroid/view/View;)V
      30: return

  void a(android.view.View, int, int, boolean, java.lang.CharSequence);
    Code:
       0: aload_0
       1: invokevirtual #268                // Method b:()Z
       4: ifeq          11
       7: aload_0
       8: invokevirtual #283                // Method a:()V
      11: aload_0
      12: getfield      #71                 // Field c:Landroid/widget/TextView;
      15: aload         5
      17: invokevirtual #286                // Method android/widget/TextView.setText:(Ljava/lang/CharSequence;)V
      20: aload_0
      21: aload_1
      22: iload_2
      23: iload_3
      24: iload         4
      26: aload_0
      27: getfield      #27                 // Field d:Landroid/view/WindowManager$LayoutParams;
      30: invokespecial #288                // Method a:(Landroid/view/View;IIZLandroid/view/WindowManager$LayoutParams;)V
      33: aload_0
      34: getfield      #38                 // Field a:Landroid/content/Context;
      37: ldc_w         #270                // String window
      40: invokevirtual #274                // Method android/content/Context.getSystemService:(Ljava/lang/String;)Ljava/lang/Object;
      43: checkcast     #276                // class android/view/WindowManager
      46: aload_0
      47: getfield      #56                 // Field b:Landroid/view/View;
      50: aload_0
      51: getfield      #27                 // Field d:Landroid/view/WindowManager$LayoutParams;
      54: invokeinterface #292,  3          // InterfaceMethod android/view/WindowManager.addView:(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
      59: return

  boolean b();
    Code:
       0: aload_0
       1: getfield      #56                 // Field b:Landroid/view/View;
       4: invokevirtual #296                // Method android/view/View.getParent:()Landroid/view/ViewParent;
       7: ifnull        12
      10: iconst_1
      11: ireturn
      12: iconst_0
      13: ireturn
}
