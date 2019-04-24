final class android.support.v4.app.v$4 implements java.lang.Runnable {
  final android.support.v4.app.x a;

  final android.support.v4.g.a b;

  final java.lang.Object c;

  final android.support.v4.app.v$a d;

  final java.util.ArrayList e;

  final android.view.View f;

  final android.support.v4.app.i g;

  final android.support.v4.app.i h;

  final boolean i;

  final java.util.ArrayList j;

  final java.lang.Object k;

  final android.graphics.Rect l;

  android.support.v4.app.v$4(android.support.v4.app.x, android.support.v4.g.a, java.lang.Object, android.support.v4.app.v$a, java.util.ArrayList, android.view.View, android.support.v4.app.i, android.support.v4.app.i, boolean, java.util.ArrayList, java.lang.Object, android.graphics.Rect);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #35                 // Field a:Landroid/support/v4/app/x;
       5: aload_0
       6: aload_2
       7: putfield      #37                 // Field b:Landroid/support/v4/g/a;
      10: aload_0
      11: aload_3
      12: putfield      #39                 // Field c:Ljava/lang/Object;
      15: aload_0
      16: aload         4
      18: putfield      #41                 // Field d:Landroid/support/v4/app/v$a;
      21: aload_0
      22: aload         5
      24: putfield      #43                 // Field e:Ljava/util/ArrayList;
      27: aload_0
      28: aload         6
      30: putfield      #45                 // Field f:Landroid/view/View;
      33: aload_0
      34: aload         7
      36: putfield      #47                 // Field g:Landroid/support/v4/app/i;
      39: aload_0
      40: aload         8
      42: putfield      #49                 // Field h:Landroid/support/v4/app/i;
      45: aload_0
      46: iload         9
      48: putfield      #51                 // Field i:Z
      51: aload_0
      52: aload         10
      54: putfield      #53                 // Field j:Ljava/util/ArrayList;
      57: aload_0
      58: aload         11
      60: putfield      #55                 // Field k:Ljava/lang/Object;
      63: aload_0
      64: aload         12
      66: putfield      #57                 // Field l:Landroid/graphics/Rect;
      69: aload_0
      70: invokespecial #60                 // Method java/lang/Object."<init>":()V
      73: return

  public void run();
    Code:
       0: aload_0
       1: getfield      #35                 // Field a:Landroid/support/v4/app/x;
       4: aload_0
       5: getfield      #37                 // Field b:Landroid/support/v4/g/a;
       8: aload_0
       9: getfield      #39                 // Field c:Ljava/lang/Object;
      12: aload_0
      13: getfield      #41                 // Field d:Landroid/support/v4/app/v$a;
      16: invokestatic  #65                 // Method android/support/v4/app/v.a:(Landroid/support/v4/app/x;Landroid/support/v4/g/a;Ljava/lang/Object;Landroid/support/v4/app/v$a;)Landroid/support/v4/g/a;
      19: astore_1
      20: aload_1
      21: ifnull        48
      24: aload_0
      25: getfield      #43                 // Field e:Ljava/util/ArrayList;
      28: aload_1
      29: invokevirtual #71                 // Method android/support/v4/g/a.values:()Ljava/util/Collection;
      32: invokevirtual #77                 // Method java/util/ArrayList.addAll:(Ljava/util/Collection;)Z
      35: pop
      36: aload_0
      37: getfield      #43                 // Field e:Ljava/util/ArrayList;
      40: aload_0
      41: getfield      #45                 // Field f:Landroid/view/View;
      44: invokevirtual #81                 // Method java/util/ArrayList.add:(Ljava/lang/Object;)Z
      47: pop
      48: aload_0
      49: getfield      #47                 // Field g:Landroid/support/v4/app/i;
      52: aload_0
      53: getfield      #49                 // Field h:Landroid/support/v4/app/i;
      56: aload_0
      57: getfield      #51                 // Field i:Z
      60: aload_1
      61: iconst_0
      62: invokestatic  #84                 // Method android/support/v4/app/v.a:(Landroid/support/v4/app/i;Landroid/support/v4/app/i;ZLandroid/support/v4/g/a;Z)V
      65: aload_0
      66: getfield      #39                 // Field c:Ljava/lang/Object;
      69: ifnull        124
      72: aload_0
      73: getfield      #35                 // Field a:Landroid/support/v4/app/x;
      76: aload_0
      77: getfield      #39                 // Field c:Ljava/lang/Object;
      80: aload_0
      81: getfield      #53                 // Field j:Ljava/util/ArrayList;
      84: aload_0
      85: getfield      #43                 // Field e:Ljava/util/ArrayList;
      88: invokevirtual #89                 // Method android/support/v4/app/x.a:(Ljava/lang/Object;Ljava/util/ArrayList;Ljava/util/ArrayList;)V
      91: aload_1
      92: aload_0
      93: getfield      #41                 // Field d:Landroid/support/v4/app/v$a;
      96: aload_0
      97: getfield      #55                 // Field k:Ljava/lang/Object;
     100: aload_0
     101: getfield      #51                 // Field i:Z
     104: invokestatic  #92                 // Method android/support/v4/app/v.a:(Landroid/support/v4/g/a;Landroid/support/v4/app/v$a;Ljava/lang/Object;Z)Landroid/view/View;
     107: astore_1
     108: aload_1
     109: ifnull        124
     112: aload_0
     113: getfield      #35                 // Field a:Landroid/support/v4/app/x;
     116: aload_1
     117: aload_0
     118: getfield      #57                 // Field l:Landroid/graphics/Rect;
     121: invokevirtual #95                 // Method android/support/v4/app/x.a:(Landroid/view/View;Landroid/graphics/Rect;)V
     124: return
}
