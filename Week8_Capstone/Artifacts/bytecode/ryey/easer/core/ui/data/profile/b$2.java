class ryey.easer.core.ui.data.profile.b$2 implements ryey.easer.core.f$f {
  final android.view.View a;

  final ryey.easer.core.ui.data.profile.b b;

  ryey.easer.core.ui.data.profile.b$2(ryey.easer.core.ui.data.profile.b, android.view.View);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #19                 // Field b:Lryey/easer/core/ui/data/profile/b;
       5: aload_0
       6: aload_2
       7: putfield      #21                 // Field a:Landroid/view/View;
      10: aload_0
      11: invokespecial #24                 // Method java/lang/Object."<init>":()V
      14: return

  public void a(java.util.Set<ryey.easer.core.e>);
    Code:
       0: aload_0
       1: getfield      #21                 // Field a:Landroid/view/View;
       4: ldc           #27                 // int 16908298
       6: invokevirtual #33                 // Method android/view/View.findViewById:(I)Landroid/view/View;
       9: checkcast     #35                 // class se/emilsjolander/stickylistheaders/StickyListHeadersListView
      12: astore_2
      13: new           #37                 // class java/util/ArrayList
      16: dup
      17: aload_0
      18: getfield      #19                 // Field b:Lryey/easer/core/ui/data/profile/b;
      21: getfield      #41                 // Field ryey/easer/core/ui/data/profile/b.l:Ljava/util/List;
      24: invokespecial #44                 // Method java/util/ArrayList."<init>":(Ljava/util/Collection;)V
      27: astore_3
      28: aload_1
      29: invokeinterface #50,  1           // InterfaceMethod java/util/Set.iterator:()Ljava/util/Iterator;
      34: astore_1
      35: aload_1
      36: invokeinterface #56,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
      41: ifeq          88
      44: aload_1
      45: invokeinterface #60,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
      50: checkcast     #62                 // class ryey/easer/core/e
      53: astore        4
      55: aload_3
      56: new           #64                 // class ryey/easer/core/ui/data/profile/b$a
      59: dup
      60: aload         4
      62: invokevirtual #68                 // Method ryey/easer/core/e.d:()Ljava/lang/String;
      65: aload         4
      67: invokevirtual #71                 // Method ryey/easer/core/e.e:()Ljava/lang/String;
      70: aload         4
      72: invokevirtual #74                 // Method ryey/easer/core/e.a:()Lryey/easer/b/a/a;
      75: aconst_null
      76: invokespecial #77                 // Method ryey/easer/core/ui/data/profile/b$a."<init>":(Ljava/lang/String;Ljava/lang/String;Lryey/easer/b/a/a;Lryey/easer/commons/local_plugin/c/d;)V
      79: invokeinterface #83,  2           // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
      84: pop
      85: goto          35
      88: aload_2
      89: new           #85                 // class ryey/easer/core/ui/data/profile/b$b
      92: dup
      93: aload_0
      94: getfield      #19                 // Field b:Lryey/easer/core/ui/data/profile/b;
      97: aload_0
      98: getfield      #19                 // Field b:Lryey/easer/core/ui/data/profile/b;
     101: invokevirtual #89                 // Method ryey/easer/core/ui/data/profile/b.getContext:()Landroid/content/Context;
     104: aload_3
     105: invokespecial #92                 // Method ryey/easer/core/ui/data/profile/b$b."<init>":(Lryey/easer/core/ui/data/profile/b;Landroid/content/Context;Ljava/util/List;)V
     108: invokevirtual #96                 // Method se/emilsjolander/stickylistheaders/StickyListHeadersListView.setAdapter:(Lse/emilsjolander/stickylistheaders/e;)V
     111: return
}
