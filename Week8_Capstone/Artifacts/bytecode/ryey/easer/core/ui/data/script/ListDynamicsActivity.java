public class ryey.easer.core.ui.data.script.ListDynamicsActivity extends android.support.v7.app.e {
  java.lang.String a;

  ryey.easer.commons.local_plugin.eventplugin.EventData b;

  java.util.List<ryey.easer.core.ui.data.script.ListDynamicsActivity$b> c;

  ryey.easer.core.ui.data.script.ListDynamicsActivity$a d;

  public ryey.easer.core.ui.data.script.ListDynamicsActivity();
    Code:
       0: aload_0
       1: invokespecial #50                 // Method android/support/v7/app/e."<init>":()V
       4: aload_0
       5: new           #52                 // class android/support/v4/g/a
       8: dup
       9: invokespecial #53                 // Method android/support/v4/g/a."<init>":()V
      12: putfield      #55                 // Field f:Ljava/util/Map;
      15: aload_0
      16: new           #57                 // class java/util/ArrayList
      19: dup
      20: invokespecial #58                 // Method java/util/ArrayList."<init>":()V
      23: putfield      #60                 // Field g:Ljava/util/List;
      26: aload_0
      27: getfield      #60                 // Field g:Ljava/util/List;
      30: invokestatic  #65                 // Method ryey/easer/core/b/a.a:()[Lryey/easer/core/b/b;
      33: invokestatic  #71                 // Method java/util/Arrays.asList:([Ljava/lang/Object;)Ljava/util/List;
      36: invokeinterface #77,  2           // InterfaceMethod java/util/List.addAll:(Ljava/util/Collection;)Z
      41: pop
      42: return

  static java.util.ArrayList a(ryey.easer.core.ui.data.script.ListDynamicsActivity);
    Code:
       0: aload_0
       1: getfield      #81                 // Field e:Ljava/util/ArrayList;
       4: areturn

  protected void onActivityResult(int, int, android.content.Intent);
    Code:
       0: iload_1
       1: bipush        100
       3: if_icmpne     40
       6: iload_2
       7: iconst_m1
       8: if_icmpne     47
      11: aload_3
      12: ldc           #85                 // String ryey.easer.core.ui.data.extras.LINK_ITEM
      14: invokevirtual #91                 // Method android/content/Intent.getParcelableExtra:(Ljava/lang/String;)Landroid/os/Parcelable;
      17: checkcast     #26                 // class ryey/easer/core/ui/data/script/ListDynamicsActivity$b
      20: astore_3
      21: aload_0
      22: getfield      #93                 // Field c:Ljava/util/List;
      25: aload_3
      26: invokeinterface #97,  2           // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
      31: pop
      32: aload_0
      33: getfield      #99                 // Field d:Lryey/easer/core/ui/data/script/ListDynamicsActivity$a;
      36: invokevirtual #102                // Method ryey/easer/core/ui/data/script/ListDynamicsActivity$a.notifyDataSetChanged:()V
      39: return
      40: aload_0
      41: iload_1
      42: iload_2
      43: aload_3
      44: invokespecial #104                // Method android/support/v7/app/e.onActivityResult:(IILandroid/content/Intent;)V
      47: return

  public boolean onContextItemSelected(android.view.MenuItem);
    Code:
       0: aload_1
       1: invokeinterface #112,  1          // InterfaceMethod android/view/MenuItem.getMenuInfo:()Landroid/view/ContextMenu$ContextMenuInfo;
       6: checkcast     #114                // class android/widget/AdapterView$AdapterContextMenuInfo
       9: astore_2
      10: aload_0
      11: getfield      #116                // Field h:Landroid/widget/ListView;
      14: aload_2
      15: getfield      #120                // Field android/widget/AdapterView$AdapterContextMenuInfo.position:I
      18: invokevirtual #126                // Method android/widget/ListView.getItemAtPosition:(I)Ljava/lang/Object;
      21: checkcast     #26                 // class ryey/easer/core/ui/data/script/ListDynamicsActivity$b
      24: astore_3
      25: aload_1
      26: invokeinterface #130,  1          // InterfaceMethod android/view/MenuItem.getItemId:()I
      31: ldc           #131                // int 2131296273
      33: if_icmpeq     42
      36: aload_0
      37: aload_1
      38: invokespecial #133                // Method android/support/v7/app/e.onContextItemSelected:(Landroid/view/MenuItem;)Z
      41: ireturn
      42: new           #135                // class android/support/v7/app/d$a
      45: dup
      46: aload_0
      47: invokespecial #138                // Method android/support/v7/app/d$a."<init>":(Landroid/content/Context;)V
      50: aload_0
      51: ldc           #139                // int 2131624240
      53: invokevirtual #143                // Method getString:(I)Ljava/lang/String;
      56: iconst_1
      57: anewarray     #145                // class java/lang/Object
      60: dup
      61: iconst_0
      62: aload_3
      63: getfield      #147                // Field ryey/easer/core/ui/data/script/ListDynamicsActivity$b.a:Ljava/lang/String;
      66: aastore
      67: invokestatic  #153                // Method java/lang/String.format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
      70: invokevirtual #156                // Method android/support/v7/app/d$a.b:(Ljava/lang/CharSequence;)Landroid/support/v7/app/d$a;
      73: ldc           #157                // int 2131623988
      75: new           #12                 // class ryey/easer/core/ui/data/script/ListDynamicsActivity$4
      78: dup
      79: aload_0
      80: invokespecial #160                // Method ryey/easer/core/ui/data/script/ListDynamicsActivity$4."<init>":(Lryey/easer/core/ui/data/script/ListDynamicsActivity;)V
      83: invokevirtual #163                // Method android/support/v7/app/d$a.b:(ILandroid/content/DialogInterface$OnClickListener;)Landroid/support/v7/app/d$a;
      86: ldc           #164                // int 2131623989
      88: new           #10                 // class ryey/easer/core/ui/data/script/ListDynamicsActivity$3
      91: dup
      92: aload_0
      93: aload_2
      94: invokespecial #167                // Method ryey/easer/core/ui/data/script/ListDynamicsActivity$3."<init>":(Lryey/easer/core/ui/data/script/ListDynamicsActivity;Landroid/widget/AdapterView$AdapterContextMenuInfo;)V
      97: invokevirtual #169                // Method android/support/v7/app/d$a.a:(ILandroid/content/DialogInterface$OnClickListener;)Landroid/support/v7/app/d$a;
     100: invokevirtual #172                // Method android/support/v7/app/d$a.c:()Landroid/support/v7/app/d;
     103: pop
     104: iconst_1
     105: ireturn

  protected void onCreate(android.os.Bundle);
    Code:
       0: aload_0
       1: aload_1
       2: invokespecial #176                // Method android/support/v7/app/e.onCreate:(Landroid/os/Bundle;)V
       5: aload_0
       6: ldc           #177                // int 2131427362
       8: invokevirtual #181                // Method setContentView:(I)V
      11: aload_0
      12: iconst_1
      13: invokevirtual #185                // Method setFinishOnTouchOutside:(Z)V
      16: aload_0
      17: aload_0
      18: ldc           #186                // int 2131296469
      20: invokevirtual #190                // Method findViewById:(I)Landroid/view/View;
      23: checkcast     #122                // class android/widget/ListView
      26: putfield      #116                // Field h:Landroid/widget/ListView;
      29: aload_0
      30: invokevirtual #194                // Method getIntent:()Landroid/content/Intent;
      33: astore_1
      34: aload_0
      35: aload_1
      36: ldc           #196                // String ryey.easer.core.ui.data.extras.PLACEHOLDERS
      38: invokevirtual #200                // Method android/content/Intent.getStringArrayListExtra:(Ljava/lang/String;)Ljava/util/ArrayList;
      41: putfield      #81                 // Field e:Ljava/util/ArrayList;
      44: aload_0
      45: aload_1
      46: ldc           #202                // String ryey.easer.core.ui.data.extra.PLUGIN_TYPE
      48: invokevirtual #206                // Method android/content/Intent.getStringExtra:(Ljava/lang/String;)Ljava/lang/String;
      51: putfield      #207                // Field a:Ljava/lang/String;
      54: ldc           #209                // String event
      56: aload_0
      57: getfield      #207                // Field a:Ljava/lang/String;
      60: invokevirtual #212                // Method java/lang/String.equals:(Ljava/lang/Object;)Z
      63: ifeq          107
      66: aload_0
      67: aload_1
      68: ldc           #214                // String ryey.easer.core.ui.data.extra.PLUGIN_DATA
      70: invokevirtual #91                 // Method android/content/Intent.getParcelableExtra:(Ljava/lang/String;)Landroid/os/Parcelable;
      73: checkcast     #216                // class ryey/easer/commons/local_plugin/eventplugin/EventData
      76: putfield      #218                // Field b:Lryey/easer/commons/local_plugin/eventplugin/EventData;
      79: aload_0
      80: getfield      #218                // Field b:Lryey/easer/commons/local_plugin/eventplugin/EventData;
      83: invokeinterface #222,  1          // InterfaceMethod ryey/easer/commons/local_plugin/eventplugin/EventData.dynamics:()[Lryey/easer/commons/local_plugin/b/a;
      88: astore_2
      89: aload_2
      90: ifnull        107
      93: aload_0
      94: getfield      #60                 // Field g:Ljava/util/List;
      97: aload_2
      98: invokestatic  #71                 // Method java/util/Arrays.asList:([Ljava/lang/Object;)Ljava/util/List;
     101: invokeinterface #77,  2           // InterfaceMethod java/util/List.addAll:(Ljava/util/Collection;)Z
     106: pop
     107: aload_0
     108: getfield      #60                 // Field g:Ljava/util/List;
     111: invokeinterface #226,  1          // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
     116: astore_2
     117: aload_2
     118: invokeinterface #232,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
     123: ifeq          156
     126: aload_2
     127: invokeinterface #236,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
     132: checkcast     #238                // class ryey/easer/commons/local_plugin/b/a
     135: astore_3
     136: aload_0
     137: getfield      #55                 // Field f:Ljava/util/Map;
     140: aload_3
     141: invokeinterface #241,  1          // InterfaceMethod ryey/easer/commons/local_plugin/b/a.a:()Ljava/lang/String;
     146: aload_3
     147: invokeinterface #247,  3          // InterfaceMethod java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
     152: pop
     153: goto          117
     156: aload_1
     157: ldc           #249                // String ryey.easer.core.ui.data.extra.DYNAMICS_LINK
     159: invokevirtual #91                 // Method android/content/Intent.getParcelableExtra:(Ljava/lang/String;)Landroid/os/Parcelable;
     162: checkcast     #251                // class ryey/easer/commons/local_plugin/b/b
     165: astore_2
     166: aload_2
     167: astore_1
     168: aload_2
     169: ifnonnull     180
     172: new           #251                // class ryey/easer/commons/local_plugin/b/b
     175: dup
     176: invokespecial #252                // Method ryey/easer/commons/local_plugin/b/b."<init>":()V
     179: astore_1
     180: aload_1
     181: invokevirtual #255                // Method ryey/easer/commons/local_plugin/b/b.a:()Ljava/util/Map;
     184: astore_2
     185: aload_0
     186: new           #57                 // class java/util/ArrayList
     189: dup
     190: aload_2
     191: invokeinterface #258,  1          // InterfaceMethod java/util/Map.size:()I
     196: invokespecial #260                // Method java/util/ArrayList."<init>":(I)V
     199: putfield      #93                 // Field c:Ljava/util/List;
     202: aload_2
     203: invokeinterface #264,  1          // InterfaceMethod java/util/Map.keySet:()Ljava/util/Set;
     208: invokeinterface #267,  1          // InterfaceMethod java/util/Set.iterator:()Ljava/util/Iterator;
     213: astore_3
     214: aload_3
     215: invokeinterface #232,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
     220: ifeq          312
     223: aload_3
     224: invokeinterface #236,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
     229: checkcast     #149                // class java/lang/String
     232: astore        4
     234: aload_2
     235: aload         4
     237: invokeinterface #271,  2          // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
     242: checkcast     #149                // class java/lang/String
     245: astore        5
     247: aconst_null
     248: astore_1
     249: aload_0
     250: getfield      #55                 // Field f:Ljava/util/Map;
     253: aload         5
     255: invokeinterface #274,  2          // InterfaceMethod java/util/Map.containsKey:(Ljava/lang/Object;)Z
     260: ifeq          287
     263: aload_0
     264: aload_0
     265: getfield      #55                 // Field f:Ljava/util/Map;
     268: aload         5
     270: invokeinterface #271,  2          // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
     275: checkcast     #238                // class ryey/easer/commons/local_plugin/b/a
     278: invokeinterface #276,  1          // InterfaceMethod ryey/easer/commons/local_plugin/b/a.b:()I
     283: invokevirtual #143                // Method getString:(I)Ljava/lang/String;
     286: astore_1
     287: aload_0
     288: getfield      #93                 // Field c:Ljava/util/List;
     291: new           #26                 // class ryey/easer/core/ui/data/script/ListDynamicsActivity$b
     294: dup
     295: aload         4
     297: aload         5
     299: aload_1
     300: invokespecial #279                // Method ryey/easer/core/ui/data/script/ListDynamicsActivity$b."<init>":(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
     303: invokeinterface #97,  2           // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
     308: pop
     309: goto          214
     312: aload_0
     313: new           #22                 // class ryey/easer/core/ui/data/script/ListDynamicsActivity$a
     316: dup
     317: aload_0
     318: aload_0
     319: getfield      #93                 // Field c:Ljava/util/List;
     322: invokespecial #282                // Method ryey/easer/core/ui/data/script/ListDynamicsActivity$a."<init>":(Landroid/content/Context;Ljava/util/List;)V
     325: putfield      #99                 // Field d:Lryey/easer/core/ui/data/script/ListDynamicsActivity$a;
     328: aload_0
     329: getfield      #116                // Field h:Landroid/widget/ListView;
     332: aload_0
     333: getfield      #99                 // Field d:Lryey/easer/core/ui/data/script/ListDynamicsActivity$a;
     336: invokevirtual #286                // Method android/widget/ListView.setAdapter:(Landroid/widget/ListAdapter;)V
     339: aload_0
     340: aload_0
     341: getfield      #116                // Field h:Landroid/widget/ListView;
     344: invokevirtual #290                // Method registerForContextMenu:(Landroid/view/View;)V
     347: aload_0
     348: ldc_w         #291                // int 2131296310
     351: invokevirtual #190                // Method findViewById:(I)Landroid/view/View;
     354: checkcast     #293                // class android/widget/Button
     357: new           #6                  // class ryey/easer/core/ui/data/script/ListDynamicsActivity$1
     360: dup
     361: aload_0
     362: invokespecial #294                // Method ryey/easer/core/ui/data/script/ListDynamicsActivity$1."<init>":(Lryey/easer/core/ui/data/script/ListDynamicsActivity;)V
     365: invokevirtual #298                // Method android/widget/Button.setOnClickListener:(Landroid/view/View$OnClickListener;)V
     368: aload_0
     369: ldc_w         #299                // int 2131296309
     372: invokevirtual #190                // Method findViewById:(I)Landroid/view/View;
     375: checkcast     #293                // class android/widget/Button
     378: new           #8                  // class ryey/easer/core/ui/data/script/ListDynamicsActivity$2
     381: dup
     382: aload_0
     383: invokespecial #300                // Method ryey/easer/core/ui/data/script/ListDynamicsActivity$2."<init>":(Lryey/easer/core/ui/data/script/ListDynamicsActivity;)V
     386: invokevirtual #298                // Method android/widget/Button.setOnClickListener:(Landroid/view/View$OnClickListener;)V
     389: return

  public void onCreateContextMenu(android.view.ContextMenu, android.view.View, android.view.ContextMenu$ContextMenuInfo);
    Code:
       0: aload_2
       1: aload_0
       2: getfield      #116                // Field h:Landroid/widget/ListView;
       5: if_acmpne     28
       8: aload_0
       9: invokevirtual #306                // Method getMenuInflater:()Landroid/view/MenuInflater;
      12: ldc_w         #307                // int 2131492868
      15: aload_1
      16: invokevirtual #313                // Method android/view/MenuInflater.inflate:(ILandroid/view/Menu;)V
      19: aload_1
      20: ldc_w         #314                // int 2131296275
      23: invokeinterface #319,  2          // InterfaceMethod android/view/ContextMenu.removeItem:(I)V
      28: return
}
