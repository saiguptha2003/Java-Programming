# Python Files Showcase

This repository contains a collection of Python files that demonstrate various programming concepts and techniques.

# Code for Identifying Dull Students

This code is designed to identify and categorize students who are performing below average in their subjects and calculate the percentage they need to improve to reach the average.

## Usage

1. Ensure you have Python and the necessary libraries (e.g., pandas) installed.
2. Call the `get_dull_students` function with the desired number of subjects and the path to your CSV file containing student marks data.
3. The function will return information about students who are performing below average in their subjects.


```python
import pandas as pd

# Function to calculate the percentage needed to improve above average
def getPercentageToImproveAboveAverage(average, marks):
    return 100 * ((average / marks) - 1)
```

# Function to identify dull students
```python
def get_dull_students(numberOfSubjects, file_path):
    ub_1_mean=dataset['sub-1'].mean()
            sub_2_mean=dataset['sub-2'].mean()
            sub_3_mean=dataset['sub-3'].mean()
            sub_4_mean=dataset['sub-4'].mean()
            sub_5_mean=dataset['sub-5'].mean()
            sub_6_mean=dataset['sub-6'].mean()
            below_mean_all_subjects=dataset[(dataset['sub-1'] < sub_1_mean) & (dataset['sub-2'] < sub_2_mean) & (dataset['sub-3'] < sub_3_mean) & (dataset['sub-4'] < sub_4_mean) & (dataset['sub-5'] < sub_5_mean) & (dataset['sub-6'] < sub_6_mean)]
            below_mean_sub_1=dataset[(dataset['sub-1'] < sub_1_mean)]
            below_mean_sub_2=dataset[(dataset['sub-2'] < sub_2_mean)]
            below_mean_sub_3=dataset[(dataset['sub-3'] < sub_3_mean)]
            below_mean_sub_4=dataset[(dataset['sub-4'] < sub_4_mean)]
            below_mean_sub_5=dataset[(dataset['sub-5'] < sub_5_mean)]
            below_mean_sub_6=dataset[(dataset['sub-6'] < sub_6_mean)]
            unique_students_sub_1= below_mean_sub_1.merge(below_mean_all_subjects, on=list(below_mean_sub_1.columns), how='left', indicator=True).query('_merge == "left_only"').drop(columns=['_merge'])
            unique_students_sub_2= below_mean_sub_2.merge(below_mean_all_subjects, on=list(below_mean_sub_2.columns), how='left', indicator=True).query('_merge == "left_only"').drop(columns=['_merge'])
            unique_students_sub_3= below_mean_sub_3.merge(below_mean_all_subjects, on=list(below_mean_sub_3.columns), how='left', indicator=True).query('_merge == "left_only"').drop(columns=['_merge'])
            unique_students_sub_4= below_mean_sub_4.merge(below_mean_all_subjects, on=list(below_mean_sub_4.columns), how='left', indicator=True).query('_merge == "left_only"').drop(columns=['_merge'])
            unique_students_sub_5= below_mean_sub_5.merge(below_mean_all_subjects, on=list(below_mean_sub_5.columns), how='left', indicator=True).query('_merge == "left_only"').drop(columns=['_merge'])
            unique_students_sub_6= below_mean_sub_6.merge(below_mean_all_subjects, on=list(below_mean_sub_6.columns), how='left', indicator=True).query('_merge == "left_only"').drop(columns=['_merge'])
            unique_students_sub_1=unique_students_sub_1.drop(['sub-2','sub-3','sub-4','sub-5','sub-6'], axis=1)
            unique_students_sub_2=unique_students_sub_2.drop(['sub-1','sub-3','sub-4','sub-5','sub-6'], axis=1)
            unique_students_sub_3=unique_students_sub_3.drop(['sub-1','sub-2','sub-4','sub-5','sub-6'], axis=1)
            unique_students_sub_4=unique_students_sub_4.drop(['sub-1','sub-2','sub-3','sub-5','sub-6'], axis=1)
            unique_students_sub_5=unique_students_sub_5.drop(['sub-1','sub-2','sub-3','sub-4','sub-6'], axis=1)
            unique_students_sub_6=unique_students_sub_6.drop(['sub-1','sub-2','sub-3','sub-4','sub-5'], axis=1)
            unique_students_sub_1['percentage to increase']=unique_students_sub_1.apply(lambda x: getPercentageToImproveAboveAverage(sub_1_mean,x['sub-1']), axis=1)
            unique_students_sub_2['percentage to increase']=unique_students_sub_2.apply(lambda x: getPercentageToImproveAboveAverage(sub_1_mean,x['sub-2']), axis=1)
            unique_students_sub_3['percentage to increase']=unique_students_sub_3.apply(lambda x: getPercentageToImproveAboveAverage(sub_1_mean,x['sub-3']), axis=1)
            unique_students_sub_4['percentage to increase']=unique_students_sub_4.apply(lambda x: getPercentageToImproveAboveAverage(sub_1_mean,x['sub-4']), axis=1)
            unique_students_sub_5['percentage to increase']=unique_students_sub_5.apply(lambda x: getPercentageToImproveAboveAverage(sub_1_mean,x['sub-5']), axis=1)
            unique_students_sub_6['percentage to increase']=unique_students_sub_6.apply(lambda x: getPercentageToImproveAboveAverage(sub_1_mean,x['sub-6']), axis=1)
            return (below_mean_all_subjects,unique_students_sub_1,unique_students_sub_2,unique_students_sub_3,unique_students_sub_4,unique_students_sub_5,unique_students_sub_6,sub_1_mean,sub_2_mean,sub_3_mean,sub_4_mean,sub_5_mean,sub_6_mean)

```

## finds the mean of perticular column

```python

sub_2_mean=dataset['sub-2'].mean()

```
## code snippet combines two DataFrames based on the columns in below_mean_sub_1, keeps only the rows unique to below_mean_sub_1 (i.e., those that didn't have a match in below_mean_all_subjects), and removes the temporary _merge column, resulting in a DataFrame named unique_students_sub_1 that contains students who are below average in sub-1 but not in the other subjects.





```python
            unique_students_sub_1= below_mean_sub_1.merge(below_mean_all_subjects, on=list(below_mean_sub_1.columns), how='left', indicator=True).query('_merge == "left_only"').drop(columns=['_merge'])

```
