# 7743bf58d1e88e67e47a8c35865fe7700586be6b (sample)

## 共通

・初期値設定済み
・UPDATEボタンでデータ更新


## DATA

・データバインディングに普通のデータを設定
→データ更新が反映されない

・BACK(3SEC FUTURE)ボタンで３秒後に前の画面に戻る


## OBSERVABLE

・データバインディングに「ObservableField」を指定
→データ更新が反映される

・BACK(3SEC FUTURE)ボタンで３秒後に前の画面に戻る
※「DATA」と同じ


## LIVEDATA

・データバインディングに「LiveData」を指定
・「binding.lifecycleOwner = viewLifecycleOwner」設定
→データ更新が反映される

・BACK(3SEC FUTURE)ボタンで３秒後にデータ更新し、データ更新をObserveして前の画面に戻る

## VIEWMODEL

・データバインディングに「LiveData」を指定
・「binding.lifecycleOwner = viewLifecycleOwner」設定
→データ更新が反映される
※「LIVEDATA」と同じ

・BACK(3SEC FUTURE)ボタンで３秒後にデータ更新し、データ更新をObserveして前の画面に戻る
※「LIVEDATA」と同じ

・別フラグメントでデータを共有し、別フラグメントにデータを表示
→データ更新が反映される


# 037f78fada171d8870fd5e3f41740b3ad05e6c5a (two-way data binding)

双方向データバインディング対応
※レイアウトにEditTextを追記しバインディング式に「@={…}」を設定（「@{…}」じゃないことに注意）
