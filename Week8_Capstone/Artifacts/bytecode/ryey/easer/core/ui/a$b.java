class ryey.easer.core.ui.a$b extends android.support.v7.widget.RecyclerView$x {
  final ryey.easer.a.a n;

  final java.lang.ref.WeakReference<android.content.Context> o;

  ryey.easer.core.ui.a$b(android.view.View, java.lang.ref.WeakReference<android.content.Context>);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #17                 // Method android/support/v7/widget/RecyclerView$x."<init>":(Landroid/view/View;)V
       5: aload_0
       6: aload_1
       7: invokestatic  #23                 // Method android/databinding/f.a:(Landroid/view/View;)Landroid/databinding/ViewDataBinding;
      10: checkcast     #25                 // class ryey/easer/a/a
      13: putfield      #27                 // Field n:Lryey/easer/a/a;
      16: aload_0
      17: aload_2
      18: putfield      #29                 // Field o:Ljava/lang/ref/WeakReference;
      21: return

  void a(ryey.easer.core.log.a);
    Code:
       0: aload_0
       1: getfield      #27                 // Field n:Lryey/easer/a/a;
       4: getfield      #71                 // Field ryey/easer/a/a.e:Landroid/widget/TableRow;
       7: bipush        8
       9: invokevirtual #77                 // Method android/widget/TableRow.setVisibility:(I)V
      12: aload_0
      13: getfield      #27                 // Field n:Lryey/easer/a/a;
      16: getfield      #80                 // Field ryey/easer/a/a.g:Landroid/widget/TableRow;
      19: bipush        8
      21: invokevirtual #77                 // Method android/widget/TableRow.setVisibility:(I)V
      24: aload_0
      25: getfield      #27                 // Field n:Lryey/easer/a/a;
      28: getfield      #83                 // Field ryey/easer/a/a.d:Landroid/widget/TableRow;
      31: bipush        8
      33: invokevirtual #77                 // Method android/widget/TableRow.setVisibility:(I)V
      36: aload_0
      37: getfield      #27                 // Field n:Lryey/easer/a/a;
      40: getfield      #86                 // Field ryey/easer/a/a.f:Landroid/widget/TableRow;
      43: bipush        8
      45: invokevirtual #77                 // Method android/widget/TableRow.setVisibility:(I)V
      48: aload_0
      49: getfield      #27                 // Field n:Lryey/easer/a/a;
      52: getfield      #89                 // Field ryey/easer/a/a.h:Landroid/widget/TableRow;
      55: bipush        8
      57: invokevirtual #77                 // Method android/widget/TableRow.setVisibility:(I)V
      60: aload_0
      61: getfield      #27                 // Field n:Lryey/easer/a/a;
      64: getfield      #91                 // Field ryey/easer/a/a.c:Landroid/widget/TableRow;
      67: bipush        8
      69: invokevirtual #77                 // Method android/widget/TableRow.setVisibility:(I)V
      72: aload_1
      73: ifnonnull     77
      76: return
      77: aload_1
      78: invokeinterface #96,  1           // InterfaceMethod ryey/easer/core/log/a.a:()J
      83: lstore_3
      84: aload_0
      85: getfield      #27                 // Field n:Lryey/easer/a/a;
      88: getfield      #89                 // Field ryey/easer/a/a.h:Landroid/widget/TableRow;
      91: iconst_0
      92: invokevirtual #77                 // Method android/widget/TableRow.setVisibility:(I)V
      95: aload_0
      96: getfield      #27                 // Field n:Lryey/easer/a/a;
      99: getfield      #99                 // Field ryey/easer/a/a.n:Landroid/widget/TextView;
     102: lload_3
     103: aload_0
     104: getfield      #29                 // Field o:Ljava/lang/ref/WeakReference;
     107: invokevirtual #105                // Method java/lang/ref/WeakReference.get:()Ljava/lang/Object;
     110: checkcast     #107                // class android/content/Context
     113: invokestatic  #109                // Method a:(JLandroid/content/Context;)Ljava/lang/String;
     116: invokevirtual #115                // Method android/widget/TextView.setText:(Ljava/lang/CharSequence;)V
     119: aload_1
     120: invokeinterface #118,  1          // InterfaceMethod ryey/easer/core/log/a.b:()Ljava/lang/String;
     125: astore        6
     127: aload         6
     129: ifnull        155
     132: aload_0
     133: getfield      #27                 // Field n:Lryey/easer/a/a;
     136: getfield      #91                 // Field ryey/easer/a/a.c:Landroid/widget/TableRow;
     139: iconst_0
     140: invokevirtual #77                 // Method android/widget/TableRow.setVisibility:(I)V
     143: aload_0
     144: getfield      #27                 // Field n:Lryey/easer/a/a;
     147: getfield      #121                // Field ryey/easer/a/a.i:Landroid/widget/TextView;
     150: aload         6
     152: invokevirtual #115                // Method android/widget/TextView.setText:(Ljava/lang/CharSequence;)V
     155: aload_1
     156: instanceof    #123                // class ryey/easer/core/log/d
     159: ifeq          270
     162: aload_1
     163: checkcast     #123                // class ryey/easer/core/log/d
     166: astore        6
     168: aload         6
     170: invokevirtual #125                // Method ryey/easer/core/log/d.e:()Ljava/lang/String;
     173: astore_1
     174: aload_0
     175: getfield      #27                 // Field n:Lryey/easer/a/a;
     178: getfield      #71                 // Field ryey/easer/a/a.e:Landroid/widget/TableRow;
     181: iconst_0
     182: invokevirtual #77                 // Method android/widget/TableRow.setVisibility:(I)V
     185: aload_0
     186: getfield      #27                 // Field n:Lryey/easer/a/a;
     189: getfield      #128                // Field ryey/easer/a/a.k:Landroid/widget/TextView;
     192: aload_1
     193: invokevirtual #115                // Method android/widget/TextView.setText:(Ljava/lang/CharSequence;)V
     196: aload         6
     198: invokevirtual #130                // Method ryey/easer/core/log/d.g:()Ljava/lang/String;
     201: astore_1
     202: aload_1
     203: ifnull        228
     206: aload_0
     207: getfield      #27                 // Field n:Lryey/easer/a/a;
     210: getfield      #83                 // Field ryey/easer/a/a.d:Landroid/widget/TableRow;
     213: iconst_0
     214: invokevirtual #77                 // Method android/widget/TableRow.setVisibility:(I)V
     217: aload_0
     218: getfield      #27                 // Field n:Lryey/easer/a/a;
     221: getfield      #133                // Field ryey/easer/a/a.j:Landroid/widget/TextView;
     224: aload_1
     225: invokevirtual #115                // Method android/widget/TextView.setText:(Ljava/lang/CharSequence;)V
     228: aload_0
     229: getfield      #27                 // Field n:Lryey/easer/a/a;
     232: getfield      #80                 // Field ryey/easer/a/a.g:Landroid/widget/TableRow;
     235: iconst_0
     236: invokevirtual #77                 // Method android/widget/TableRow.setVisibility:(I)V
     239: aload_0
     240: getfield      #27                 // Field n:Lryey/easer/a/a;
     243: getfield      #136                // Field ryey/easer/a/a.m:Landroid/widget/TextView;
     246: astore_1
     247: aload         6
     249: invokevirtual #139                // Method ryey/easer/core/log/d.f:()Z
     252: ifeq          261
     255: ldc           #140                // int 2131623968
     257: istore_2
     258: goto          264
     261: ldc           #141                // int 2131623975
     263: istore_2
     264: aload_1
     265: iload_2
     266: invokevirtual #143                // Method android/widget/TextView.setText:(I)V
     269: return
     270: aload_1
     271: instanceof    #145                // class ryey/easer/core/log/c
     274: ifeq          308
     277: aload_1
     278: checkcast     #145                // class ryey/easer/core/log/c
     281: invokevirtual #146                // Method ryey/easer/core/log/c.e:()Ljava/lang/String;
     284: astore_1
     285: aload_0
     286: getfield      #27                 // Field n:Lryey/easer/a/a;
     289: getfield      #83                 // Field ryey/easer/a/a.d:Landroid/widget/TableRow;
     292: iconst_0
     293: invokevirtual #77                 // Method android/widget/TableRow.setVisibility:(I)V
     296: aload_0
     297: getfield      #27                 // Field n:Lryey/easer/a/a;
     300: getfield      #133                // Field ryey/easer/a/a.j:Landroid/widget/TextView;
     303: aload_1
     304: invokevirtual #115                // Method android/widget/TextView.setText:(Ljava/lang/CharSequence;)V
     307: return
     308: aload_1
     309: instanceof    #148                // class ryey/easer/core/log/e
     312: ifeq          391
     315: aload_1
     316: checkcast     #148                // class ryey/easer/core/log/e
     319: astore_1
     320: aload_1
     321: invokevirtual #149                // Method ryey/easer/core/log/e.e:()Ljava/lang/String;
     324: astore        6
     326: aload_1
     327: invokevirtual #150                // Method ryey/easer/core/log/e.f:()Z
     330: istore        5
     332: aload_0
     333: getfield      #27                 // Field n:Lryey/easer/a/a;
     336: getfield      #86                 // Field ryey/easer/a/a.f:Landroid/widget/TableRow;
     339: iconst_0
     340: invokevirtual #77                 // Method android/widget/TableRow.setVisibility:(I)V
     343: aload_0
     344: getfield      #27                 // Field n:Lryey/easer/a/a;
     347: getfield      #153                // Field ryey/easer/a/a.l:Landroid/widget/TextView;
     350: aload         6
     352: invokevirtual #115                // Method android/widget/TextView.setText:(Ljava/lang/CharSequence;)V
     355: aload_0
     356: getfield      #27                 // Field n:Lryey/easer/a/a;
     359: getfield      #80                 // Field ryey/easer/a/a.g:Landroid/widget/TableRow;
     362: iconst_0
     363: invokevirtual #77                 // Method android/widget/TableRow.setVisibility:(I)V
     366: aload_0
     367: getfield      #27                 // Field n:Lryey/easer/a/a;
     370: getfield      #136                // Field ryey/easer/a/a.m:Landroid/widget/TextView;
     373: astore_1
     374: iload         5
     376: ifeq          385
     379: ldc           #154                // int 2131623971
     381: istore_2
     382: goto          264
     385: ldc           #155                // int 2131623973
     387: istore_2
     388: goto          264
     391: return
}
