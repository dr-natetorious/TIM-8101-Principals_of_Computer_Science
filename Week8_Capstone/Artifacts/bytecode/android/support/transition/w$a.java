class android.support.transition.w$a implements android.view.View$OnAttachStateChangeListener,android.view.ViewTreeObserver$OnPreDrawListener {
  android.support.transition.u a;

  android.view.ViewGroup b;

  android.support.transition.w$a(android.support.transition.u, android.view.ViewGroup);
    Code:
       0: aload_0
       1: invokespecial #21                 // Method java/lang/Object."<init>":()V
       4: aload_0
       5: aload_1
       6: putfield      #23                 // Field a:Landroid/support/transition/u;
       9: aload_0
      10: aload_2
      11: putfield      #25                 // Field b:Landroid/view/ViewGroup;
      14: return

  public boolean onPreDraw();
    Code:
       0: aload_0
       1: invokespecial #46                 // Method a:()V
       4: invokestatic  #49                 // Method android/support/transition/w.b:()Ljava/util/ArrayList;
       7: aload_0
       8: getfield      #25                 // Field b:Landroid/view/ViewGroup;
      11: invokevirtual #55                 // Method java/util/ArrayList.remove:(Ljava/lang/Object;)Z
      14: ifne          19
      17: iconst_1
      18: ireturn
      19: invokestatic  #58                 // Method android/support/transition/w.a:()Landroid/support/v4/g/a;
      22: astore        4
      24: aload         4
      26: aload_0
      27: getfield      #25                 // Field b:Landroid/view/ViewGroup;
      30: invokevirtual #64                 // Method android/support/v4/g/a.get:(Ljava/lang/Object;)Ljava/lang/Object;
      33: checkcast     #51                 // class java/util/ArrayList
      36: astore_3
      37: aconst_null
      38: astore_2
      39: aload_3
      40: ifnonnull     65
      43: new           #51                 // class java/util/ArrayList
      46: dup
      47: invokespecial #65                 // Method java/util/ArrayList."<init>":()V
      50: astore_1
      51: aload         4
      53: aload_0
      54: getfield      #25                 // Field b:Landroid/view/ViewGroup;
      57: aload_1
      58: invokevirtual #69                 // Method android/support/v4/g/a.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      61: pop
      62: goto          85
      65: aload_3
      66: astore_1
      67: aload_3
      68: invokevirtual #73                 // Method java/util/ArrayList.size:()I
      71: ifle          85
      74: new           #51                 // class java/util/ArrayList
      77: dup
      78: aload_3
      79: invokespecial #76                 // Method java/util/ArrayList."<init>":(Ljava/util/Collection;)V
      82: astore_2
      83: aload_3
      84: astore_1
      85: aload_1
      86: aload_0
      87: getfield      #23                 // Field a:Landroid/support/transition/u;
      90: invokevirtual #79                 // Method java/util/ArrayList.add:(Ljava/lang/Object;)Z
      93: pop
      94: aload_0
      95: getfield      #23                 // Field a:Landroid/support/transition/u;
      98: new           #13                 // class android/support/transition/w$a$1
     101: dup
     102: aload_0
     103: aload         4
     105: invokespecial #82                 // Method android/support/transition/w$a$1."<init>":(Landroid/support/transition/w$a;Landroid/support/v4/g/a;)V
     108: invokevirtual #87                 // Method android/support/transition/u.a:(Landroid/support/transition/u$c;)Landroid/support/transition/u;
     111: pop
     112: aload_0
     113: getfield      #23                 // Field a:Landroid/support/transition/u;
     116: aload_0
     117: getfield      #25                 // Field b:Landroid/view/ViewGroup;
     120: iconst_0
     121: invokevirtual #90                 // Method android/support/transition/u.a:(Landroid/view/ViewGroup;Z)V
     124: aload_2
     125: ifnull        161
     128: aload_2
     129: invokevirtual #94                 // Method java/util/ArrayList.iterator:()Ljava/util/Iterator;
     132: astore_1
     133: aload_1
     134: invokeinterface #99,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
     139: ifeq          161
     142: aload_1
     143: invokeinterface #103,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
     148: checkcast     #84                 // class android/support/transition/u
     151: aload_0
     152: getfield      #25                 // Field b:Landroid/view/ViewGroup;
     155: invokevirtual #107                // Method android/support/transition/u.e:(Landroid/view/View;)V
     158: goto          133
     161: aload_0
     162: getfield      #23                 // Field a:Landroid/support/transition/u;
     165: aload_0
     166: getfield      #25                 // Field b:Landroid/view/ViewGroup;
     169: invokevirtual #110                // Method android/support/transition/u.a:(Landroid/view/ViewGroup;)V
     172: iconst_1
     173: ireturn

  public void onViewAttachedToWindow(android.view.View);
    Code:
       0: return

  public void onViewDetachedFromWindow(android.view.View);
    Code:
       0: aload_0
       1: invokespecial #46                 // Method a:()V
       4: invokestatic  #49                 // Method android/support/transition/w.b:()Ljava/util/ArrayList;
       7: aload_0
       8: getfield      #25                 // Field b:Landroid/view/ViewGroup;
      11: invokevirtual #55                 // Method java/util/ArrayList.remove:(Ljava/lang/Object;)Z
      14: pop
      15: invokestatic  #58                 // Method android/support/transition/w.a:()Landroid/support/v4/g/a;
      18: aload_0
      19: getfield      #25                 // Field b:Landroid/view/ViewGroup;
      22: invokevirtual #64                 // Method android/support/v4/g/a.get:(Ljava/lang/Object;)Ljava/lang/Object;
      25: checkcast     #51                 // class java/util/ArrayList
      28: astore_1
      29: aload_1
      30: ifnull        73
      33: aload_1
      34: invokevirtual #73                 // Method java/util/ArrayList.size:()I
      37: ifle          73
      40: aload_1
      41: invokevirtual #94                 // Method java/util/ArrayList.iterator:()Ljava/util/Iterator;
      44: astore_1
      45: aload_1
      46: invokeinterface #99,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
      51: ifeq          73
      54: aload_1
      55: invokeinterface #103,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
      60: checkcast     #84                 // class android/support/transition/u
      63: aload_0
      64: getfield      #25                 // Field b:Landroid/view/ViewGroup;
      67: invokevirtual #107                // Method android/support/transition/u.e:(Landroid/view/View;)V
      70: goto          45
      73: aload_0
      74: getfield      #23                 // Field a:Landroid/support/transition/u;
      77: iconst_1
      78: invokevirtual #115                // Method android/support/transition/u.a:(Z)V
      81: return
}
