public final class ryey.easer.core.ui.c$e extends de.blox.graphview.b<de.blox.graphview.m> {
  final ryey.easer.core.ui.c a;

  final de.blox.graphview.e b;

  ryey.easer.core.ui.c$e(de.blox.graphview.e, de.blox.graphview.e);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #18                 // Field a:Lryey/easer/core/ui/c;
       5: aload_0
       6: aload_2
       7: putfield      #20                 // Field b:Lde/blox/graphview/e;
      10: aload_0
      11: aload_3
      12: invokespecial #23                 // Method de/blox/graphview/b."<init>":(Lde/blox/graphview/e;)V
      15: return

  public de.blox.graphview.m a(android.view.ViewGroup, int);
    Code:
       0: aload_1
       1: ldc           #29                 // String parent
       3: invokestatic  #34                 // Method a/b/b/c.b:(Ljava/lang/Object;Ljava/lang/String;)V
       6: aload_1
       7: invokevirtual #40                 // Method android/view/ViewGroup.getContext:()Landroid/content/Context;
      10: invokestatic  #46                 // Method android/view/LayoutInflater.from:(Landroid/content/Context;)Landroid/view/LayoutInflater;
      13: ldc           #47                 // int 2131427409
      15: aload_1
      16: iconst_0
      17: invokevirtual #51                 // Method android/view/LayoutInflater.inflate:(ILandroid/view/ViewGroup;Z)Landroid/view/View;
      20: astore_1
      21: aload_1
      22: ldc           #53                 // String v
      24: invokestatic  #55                 // Method a/b/b/c.a:(Ljava/lang/Object;Ljava/lang/String;)V
      27: new           #57                 // class ryey/easer/core/ui/c$d
      30: dup
      31: aload_1
      32: invokespecial #60                 // Method ryey/easer/core/ui/c$d."<init>":(Landroid/view/View;)V
      35: checkcast     #62                 // class de/blox/graphview/m
      38: areturn

  public void a(de.blox.graphview.m, java.lang.Object, int);
    Code:
       0: aload_1
       1: ldc           #65                 // String viewHolder
       3: invokestatic  #34                 // Method a/b/b/c.b:(Ljava/lang/Object;Ljava/lang/String;)V
       6: aload_2
       7: ldc           #67                 // String data
       9: invokestatic  #34                 // Method a/b/b/c.b:(Ljava/lang/Object;Ljava/lang/String;)V
      12: aload_2
      13: instanceof    #69                 // class ryey/easer/core/a/a
      16: ifeq          167
      19: aload_1
      20: checkcast     #57                 // class ryey/easer/core/ui/c$d
      23: astore        4
      25: aload         4
      27: invokevirtual #72                 // Method ryey/easer/core/ui/c$d.a:()Landroid/widget/TextView;
      30: astore        5
      32: aload_2
      33: checkcast     #69                 // class ryey/easer/core/a/a
      36: astore_1
      37: aload         5
      39: aload_1
      40: getfield      #75                 // Field ryey/easer/core/a/a.a:Ljava/lang/String;
      43: checkcast     #77                 // class java/lang/CharSequence
      46: invokevirtual #83                 // Method android/widget/TextView.setText:(Ljava/lang/CharSequence;)V
      49: aload_1
      50: getfield      #87                 // Field ryey/easer/core/a/a.c:Z
      53: ifeq          62
      56: ldc           #88                 // int 2131099745
      58: istore_3
      59: goto          65
      62: ldc           #89                 // int 2131099744
      64: istore_3
      65: aload         4
      67: invokevirtual #72                 // Method ryey/easer/core/ui/c$d.a:()Landroid/widget/TextView;
      70: aload_0
      71: getfield      #18                 // Field a:Lryey/easer/core/ui/c;
      74: invokevirtual #93                 // Method ryey/easer/core/ui/c.getResources:()Landroid/content/res/Resources;
      77: iload_3
      78: invokevirtual #99                 // Method android/content/res/Resources.getColor:(I)I
      81: invokevirtual #103                // Method android/widget/TextView.setTextColor:(I)V
      84: aload_1
      85: getfield      #105                // Field ryey/easer/core/a/a.b:Z
      88: ifeq          97
      91: ldc           #106                // int 2131099741
      93: istore_3
      94: goto          100
      97: ldc           #107                // int 2131099742
      99: istore_3
     100: aload         4
     102: aload_0
     103: getfield      #18                 // Field a:Lryey/easer/core/ui/c;
     106: invokevirtual #93                 // Method ryey/easer/core/ui/c.getResources:()Landroid/content/res/Resources;
     109: iload_3
     110: invokevirtual #99                 // Method android/content/res/Resources.getColor:(I)I
     113: invokevirtual #109                // Method ryey/easer/core/ui/c$d.a:(I)V
     116: aload         4
     118: invokevirtual #112                // Method ryey/easer/core/ui/c$d.b:()Landroid/view/ViewGroup;
     121: iconst_0
     122: invokevirtual #115                // Method android/view/ViewGroup.setVisibility:(I)V
     125: aload         4
     127: invokevirtual #117                // Method ryey/easer/core/ui/c$d.c:()Landroid/widget/TextView;
     130: astore_2
     131: aload_0
     132: getfield      #18                 // Field a:Lryey/easer/core/ui/c;
     135: astore        4
     137: aload_1
     138: getfield      #120                // Field ryey/easer/core/a/a.d:Z
     141: ifeq          150
     144: ldc           #121                // int 2131624297
     146: istore_3
     147: goto          153
     150: ldc           #122                // int 2131624304
     152: istore_3
     153: aload_2
     154: aload         4
     156: iload_3
     157: invokevirtual #126                // Method ryey/easer/core/ui/c.getString:(I)Ljava/lang/String;
     160: checkcast     #77                 // class java/lang/CharSequence
     163: invokevirtual #83                 // Method android/widget/TextView.setText:(Ljava/lang/CharSequence;)V
     166: return
     167: aload_1
     168: checkcast     #57                 // class ryey/easer/core/ui/c$d
     171: astore        4
     173: aload         4
     175: invokevirtual #112                // Method ryey/easer/core/ui/c$d.b:()Landroid/view/ViewGroup;
     178: bipush        8
     180: invokevirtual #115                // Method android/view/ViewGroup.setVisibility:(I)V
     183: aload_2
     184: instanceof    #128                // class ryey/easer/core/ui/c$b
     187: ifeq          230
     190: aload         4
     192: invokevirtual #72                 // Method ryey/easer/core/ui/c$d.a:()Landroid/widget/TextView;
     195: aload_2
     196: checkcast     #128                // class ryey/easer/core/ui/c$b
     199: invokevirtual #131                // Method ryey/easer/core/ui/c$b.a:()Ljava/lang/String;
     202: checkcast     #77                 // class java/lang/CharSequence
     205: invokevirtual #83                 // Method android/widget/TextView.setText:(Ljava/lang/CharSequence;)V
     208: aload_0
     209: getfield      #18                 // Field a:Lryey/easer/core/ui/c;
     212: invokevirtual #93                 // Method ryey/easer/core/ui/c.getResources:()Landroid/content/res/Resources;
     215: astore_1
     216: ldc           #132                // int 2131099739
     218: istore_3
     219: aload         4
     221: aload_1
     222: iload_3
     223: invokevirtual #99                 // Method android/content/res/Resources.getColor:(I)I
     226: invokevirtual #109                // Method ryey/easer/core/ui/c$d.a:(I)V
     229: return
     230: aload_2
     231: instanceof    #134                // class ryey/easer/core/ui/c$c
     234: ifeq          276
     237: aload         4
     239: invokevirtual #72                 // Method ryey/easer/core/ui/c$d.a:()Landroid/widget/TextView;
     242: aload_0
     243: getfield      #18                 // Field a:Lryey/easer/core/ui/c;
     246: aload_2
     247: checkcast     #134                // class ryey/easer/core/ui/c$c
     250: invokevirtual #137                // Method ryey/easer/core/ui/c$c.a:()I
     253: invokevirtual #126                // Method ryey/easer/core/ui/c.getString:(I)Ljava/lang/String;
     256: checkcast     #77                 // class java/lang/CharSequence
     259: invokevirtual #83                 // Method android/widget/TextView.setText:(Ljava/lang/CharSequence;)V
     262: aload_0
     263: getfield      #18                 // Field a:Lryey/easer/core/ui/c;
     266: invokevirtual #93                 // Method ryey/easer/core/ui/c.getResources:()Landroid/content/res/Resources;
     269: astore_1
     270: ldc           #138                // int 2131099740
     272: istore_3
     273: goto          219
     276: return
}
