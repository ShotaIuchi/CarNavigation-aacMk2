# 7743bf58d1e88e67e47a8c35865fe7700586be6b (sample)

## 共通
（[MainActivity.kt](app/src/main/java/com/example/aacmk2/MainActivity.kt)）
（[TopFragment.kt](app/src/main/java/com/example/aacmk2/TopFragment.kt)）
（[activity_main.xml](app/src/main/res/layout/activity_main.xml)）
（[top_fragment.xml](app/src/main/res/layout/top_fragment.xml)）
（[graph.xml](app/src/main/res/navigation/graph.xml)）

```
起動直後フラグメント
```

## DATA
（[DataFragment.kt](app/src/main/java/com/example/aacmk2/DataFragment.kt)）
（[DataData.kt](app/src/main/java/com/example/aacmk2/DataData.kt)）
（[data_fragment.xml](app/src/main/res/layout/data_fragment.xml)）

```
・初期値設定済み
・UPDATEボタンでデータ更新
・データバインディングに普通のデータを設定
　→データ更新が反映されない
・BACK(3SEC FUTURE)ボタンで３秒後に前の画面に戻る
```

## OBSERVABLE
（[ObservableFragment.kt](app/src/main/java/com/example/aacmk2/ObservableFragment.kt)）
（[ObservableData.kt](app/src/main/java/com/example/aacmk2/ObservableData.kt)）
（[observable_fragment.xml](app/src/main/res/layout/observable_fragment.xml)）

```
・初期値設定済み
・UPDATEボタンでデータ更新
・データバインディングに「ObservableField」を指定
　→データ更新が反映される
・BACK(3SEC FUTURE)ボタンで３秒後に前の画面に戻る
```

## LIVEDATA
（[LiveDataFragment.kt](app/src/main/java/com/example/aacmk2/LiveDataFragment.kt)）
（[LiveDataData.kt](app/src/main/java/com/example/aacmk2/LiveDataData.kt)）
（[live_data_fragment.xml](app/src/main/res/layout/live_data_fragment.xml)）

```
・初期値設定済み
・UPDATEボタンでデータ更新
・データバインディングに「LiveData」を指定
・「binding.lifecycleOwner = viewLifecycleOwner」設定
　→データ更新が反映される
・BACK(3SEC FUTURE)ボタンで３秒後にデータ更新し、データ更新をObserveして前の画面に戻る
```

## VIEWMODEL
（[ViewModelFragment.kt](app/src/main/java/com/example/aacmk2/ViewModelFragment.kt)）
（[ViewModelViewModel.kt](app/src/main/java/com/example/aacmk2/ViewModelViewModel.kt)）
（[ViewModelSubFragment.kt](app/src/main/java/com/example/aacmk2/ViewModelSubFragment.kt)）
（[view_model_fragment.xml](app/src/main/res/layout/view_model_fragment.xml)）
（[view_model_sub_fragment.xml](app/src/main/res/layout/view_model_sub_fragment.xml)）

```
・初期値設定済み
・UPDATEボタンでデータ更新
・データバインディングに「LiveData」を指定
・「binding.lifecycleOwner = viewLifecycleOwner」設定
　→データ更新が反映される
・BACK(3SEC FUTURE)ボタンで３秒後にデータ更新し、データ更新をObserveして前の画面に戻る
・別フラグメントでデータを共有し、別フラグメントにデータを表示
　データ更新が反映される
```

# 037f78fada171d8870fd5e3f41740b3ad05e6c5a (two-way data binding)

```
・双方向データバインディング対応
　※レイアウトにEditTextを追記しバインディング式に「@={…}」を設定（「@{…}」じゃないことに注意）
```
