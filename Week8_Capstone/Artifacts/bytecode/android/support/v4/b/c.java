public class android.support.v4.b.c {
  static {};
    Code:
       0: getstatic     #19                 // Field android/os/Build$VERSION.SDK_INT:I
       3: bipush        26
       5: if_icmplt     23
       8: new           #21                 // class android/support/v4/b/f
      11: dup
      12: invokespecial #24                 // Method android/support/v4/b/f."<init>":()V
      15: astore_0
      16: aload_0
      17: putstatic     #26                 // Field a:Landroid/support/v4/b/c$a;
      20: goto          78
      23: getstatic     #19                 // Field android/os/Build$VERSION.SDK_INT:I
      26: bipush        24
      28: if_icmplt     48
      31: invokestatic  #31                 // Method android/support/v4/b/e.a:()Z
      34: ifeq          48
      37: new           #28                 // class android/support/v4/b/e
      40: dup
      41: invokespecial #32                 // Method android/support/v4/b/e."<init>":()V
      44: astore_0
      45: goto          16
      48: getstatic     #19                 // Field android/os/Build$VERSION.SDK_INT:I
      51: bipush        21
      53: if_icmplt     67
      56: new           #34                 // class android/support/v4/b/d
      59: dup
      60: invokespecial #35                 // Method android/support/v4/b/d."<init>":()V
      63: astore_0
      64: goto          16
      67: new           #37                 // class android/support/v4/b/g
      70: dup
      71: invokespecial #38                 // Method android/support/v4/b/g."<init>":()V
      74: astore_0
      75: goto          16
      78: new           #40                 // class android/support/v4/g/g
      81: dup
      82: bipush        16
      84: invokespecial #43                 // Method android/support/v4/g/g."<init>":(I)V
      87: putstatic     #45                 // Field b:Landroid/support/v4/g/g;
      90: return

  public static android.graphics.Typeface a(android.content.Context, android.content.res.Resources, int, java.lang.String, int);
    Code:
       0: getstatic     #26                 // Field a:Landroid/support/v4/b/c$a;
       3: aload_0
       4: aload_1
       5: iload_2
       6: aload_3
       7: iload         4
       9: invokeinterface #49,  6           // InterfaceMethod android/support/v4/b/c$a.a:(Landroid/content/Context;Landroid/content/res/Resources;ILjava/lang/String;I)Landroid/graphics/Typeface;
      14: astore_0
      15: aload_0
      16: ifnull        36
      19: aload_1
      20: iload_2
      21: iload         4
      23: invokestatic  #52                 // Method b:(Landroid/content/res/Resources;II)Ljava/lang/String;
      26: astore_1
      27: getstatic     #45                 // Field b:Landroid/support/v4/g/g;
      30: aload_1
      31: aload_0
      32: invokevirtual #55                 // Method android/support/v4/g/g.a:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      35: pop
      36: aload_0
      37: areturn

  public static android.graphics.Typeface a(android.content.Context, android.os.CancellationSignal, android.support.v4.f.b$b[], int);
    Code:
       0: getstatic     #26                 // Field a:Landroid/support/v4/b/c$a;
       3: aload_0
       4: aload_1
       5: aload_2
       6: iload_3
       7: invokeinterface #58,  5           // InterfaceMethod android/support/v4/b/c$a.a:(Landroid/content/Context;Landroid/os/CancellationSignal;[Landroid/support/v4/f/b$b;I)Landroid/graphics/Typeface;
      12: areturn

  public static android.graphics.Typeface a(android.content.Context, android.support.v4.a.a.a$a, android.content.res.Resources, int, int, android.support.v4.a.a.b$a, android.os.Handler, boolean);
    Code:
       0: aload_1
       1: instanceof    #61                 // class android/support/v4/a/a/a$d
       4: ifeq          80
       7: aload_1
       8: checkcast     #61                 // class android/support/v4/a/a/a$d
      11: astore_1
      12: iconst_0
      13: istore        9
      15: iload         7
      17: ifeq          33
      20: aload_1
      21: invokevirtual #64                 // Method android/support/v4/a/a/a$d.b:()I
      24: ifne          41
      27: iconst_1
      28: istore        9
      30: goto          41
      33: aload         5
      35: ifnonnull     41
      38: goto          27
      41: iload         7
      43: ifeq          55
      46: aload_1
      47: invokevirtual #67                 // Method android/support/v4/a/a/a$d.c:()I
      50: istore        8
      52: goto          58
      55: iconst_m1
      56: istore        8
      58: aload_0
      59: aload_1
      60: invokevirtual #70                 // Method android/support/v4/a/a/a$d.a:()Landroid/support/v4/f/a;
      63: aload         5
      65: aload         6
      67: iload         9
      69: iload         8
      71: iload         4
      73: invokestatic  #75                 // Method android/support/v4/f/b.a:(Landroid/content/Context;Landroid/support/v4/f/a;Landroid/support/v4/a/a/b$a;Landroid/os/Handler;ZII)Landroid/graphics/Typeface;
      76: astore_0
      77: goto          132
      80: getstatic     #26                 // Field a:Landroid/support/v4/b/c$a;
      83: aload_0
      84: aload_1
      85: checkcast     #77                 // class android/support/v4/a/a/a$b
      88: aload_2
      89: iload         4
      91: invokeinterface #80,  5           // InterfaceMethod android/support/v4/b/c$a.a:(Landroid/content/Context;Landroid/support/v4/a/a/a$b;Landroid/content/res/Resources;I)Landroid/graphics/Typeface;
      96: astore_1
      97: aload_1
      98: astore_0
      99: aload         5
     101: ifnull        132
     104: aload_1
     105: ifnull        121
     108: aload         5
     110: aload_1
     111: aload         6
     113: invokevirtual #85                 // Method android/support/v4/a/a/b$a.a:(Landroid/graphics/Typeface;Landroid/os/Handler;)V
     116: aload_1
     117: astore_0
     118: goto          132
     121: aload         5
     123: bipush        -3
     125: aload         6
     127: invokevirtual #88                 // Method android/support/v4/a/a/b$a.a:(ILandroid/os/Handler;)V
     130: aload_1
     131: astore_0
     132: aload_0
     133: ifnull        151
     136: getstatic     #45                 // Field b:Landroid/support/v4/g/g;
     139: aload_2
     140: iload_3
     141: iload         4
     143: invokestatic  #52                 // Method b:(Landroid/content/res/Resources;II)Ljava/lang/String;
     146: aload_0
     147: invokevirtual #55                 // Method android/support/v4/g/g.a:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
     150: pop
     151: aload_0
     152: areturn

  public static android.graphics.Typeface a(android.content.res.Resources, int, int);
    Code:
       0: getstatic     #45                 // Field b:Landroid/support/v4/g/g;
       3: aload_0
       4: iload_1
       5: iload_2
       6: invokestatic  #52                 // Method b:(Landroid/content/res/Resources;II)Ljava/lang/String;
       9: invokevirtual #92                 // Method android/support/v4/g/g.a:(Ljava/lang/Object;)Ljava/lang/Object;
      12: checkcast     #94                 // class android/graphics/Typeface
      15: areturn
}
