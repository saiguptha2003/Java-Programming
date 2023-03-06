for i in ~/Documents/java/sample/*
do 
	echo "file name : $(basename $i)"
	`java $i`
done
