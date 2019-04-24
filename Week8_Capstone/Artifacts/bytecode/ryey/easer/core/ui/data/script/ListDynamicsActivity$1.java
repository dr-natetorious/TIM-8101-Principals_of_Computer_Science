class ryey.easer.core.ui.data.script.ListDynamicsActivity$1 implements android.view.View$OnClickListener {
  final ryey.easer.core.ui.data.script.ListDynamicsActivity a;

  ryey.easer.core.ui.data.script.ListDynamicsActivity$1(ryey.easer.core.ui.data.script.ListDynamicsActivity);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #17                 // Field a:Lryey/easer/core/ui/data/script/ListDynamicsActivity;
       5: aload_0
       6: invokespecial #20                 // Method java/lang/Object."<init>":()V
       9: return

  public void onClick(android.view.View);
    Code:
       0: new           #25                 // class android/content/Intent
       3: dup
       4: aload_0
       5: getfield      #17                 // Field a:Lryey/easer/core/ui/data/script/ListDynamicsActivity;
       8: ldc           #27                 // class ryey/easer/core/ui/data/script/ListDynamicsActivity$EditDynamicsActivity
      10: invokespecial #30                 // Method android/content/Intent."<init>":(Landroid/content/Context;Ljava/lang/Class;)V
      13: astore_1
      14: new           #32                 // class java/util/ArrayList
      17: dup
      18: aload_0
      19: getfield      #17                 // Field a:Lryey/easer/core/ui/data/script/ListDynamicsActivity;
      22: invokestatic  #35                 // Method ryey/easer/core/ui/data/script/ListDynamicsActivity.a:(Lryey/easer/core/ui/data/script/ListDynamicsActivity;)Ljava/util/ArrayList;
      25: invokevirtual #39                 // Method java/util/ArrayList.size:()I
      28: invokespecial #42                 // Method java/util/ArrayList."<init>":(I)V
      31: astore_2
      32: aload_2
      33: aload_0
      34: getfield      #17                 // Field a:Lryey/easer/core/ui/data/script/ListDynamicsActivity;
      37: invokestatic  #35                 // Method ryey/easer/core/ui/data/script/ListDynamicsActivity.a:(Lryey/easer/core/ui/data/script/ListDynamicsActivity;)Ljava/util/ArrayList;
      40: invokevirtual #46                 // Method java/util/ArrayList.addAll:(Ljava/util/Collection;)Z
      43: pop
      44: aload_0
      45: getfield      #17                 // Field a:Lryey/easer/core/ui/data/script/ListDynamicsActivity;
      48: getfield      #50                 // Field ryey/easer/core/ui/data/script/ListDynamicsActivity.c:Ljava/util/List;
      51: invokeinterface #56,  1           // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
      56: astore_3
      57: aload_3
      58: invokeinterface #62,  1           // InterfaceMethod java/util/Iterator.hasNext:()Z
      63: ifeq          86
      66: aload_2
      67: aload_3
      68: invokeinterface #66,  1           // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
      73: checkcast     #68                 // class ryey/easer/core/ui/data/script/ListDynamicsActivity$b
      76: getfield      #71                 // Field ryey/easer/core/ui/data/script/ListDynamicsActivity$b.a:Ljava/lang/String;
      79: invokevirtual #75                 // Method java/util/ArrayList.remove:(Ljava/lang/Object;)Z
      82: pop
      83: goto          57
      86: aload_1
      87: ldc           #77                 // String ryey.easer.core.ui.data.extras.PLACEHOLDERS
      89: aload_2
      90: invokevirtual #81                 // Method android/content/Intent.putStringArrayListExtra:(Ljava/lang/String;Ljava/util/ArrayList;)Landroid/content/Intent;
      93: pop
      94: aload_1
      95: ldc           #83                 // String ryey.easer.core.ui.data.extra.PLUGIN_TYPE
      97: aload_0
      98: getfield      #17                 // Field a:Lryey/easer/core/ui/data/script/ListDynamicsActivity;
     101: getfield      #84                 // Field ryey/easer/core/ui/data/script/ListDynamicsActivity.a:Ljava/lang/String;
     104: invokevirtual #88                 // Method android/content/Intent.putExtra:(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
     107: pop
     108: ldc           #90                 // String event
     110: aload_0
     111: getfield      #17                 // Field a:Lryey/easer/core/ui/data/script/ListDynamicsActivity;
     114: getfield      #84                 // Field ryey/easer/core/ui/data/script/ListDynamicsActivity.a:Ljava/lang/String;
     117: invokevirtual #95                 // Method java/lang/String.equals:(Ljava/lang/Object;)Z
     120: ifeq          137
     123: aload_1
     124: ldc           #97                 // String ryey.easer.core.ui.data.extra.PLUGIN_DATA
     126: aload_0
     127: getfield      #17                 // Field a:Lryey/easer/core/ui/data/script/ListDynamicsActivity;
     130: getfield      #101                // Field ryey/easer/core/ui/data/script/ListDynamicsActivity.b:Lryey/easer/commons/local_plugin/eventplugin/EventData;
     133: invokevirtual #104                // Method android/content/Intent.putExtra:(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;
     136: pop
     137: aload_0
     138: getfield      #17                 // Field a:Lryey/easer/core/ui/data/script/ListDynamicsActivity;
     141: aload_1
     142: bipush        100
     144: invokevirtual #108                // Method ryey/easer/core/ui/data/script/ListDynamicsActivity.startActivityForResult:(Landroid/content/Intent;I)V
     147: return
}
