# Stress Test tools

## Base Project

Please visit `ddosify` for more information

[Ddosify](https://github.com/ddosify/ddosify)

## Customization

- Adjust `http` requester, to be able to randomize `body request` if applicable (separated by `;`, where last element should not have any trailing `;`)

    e.g.
    ```
    {
        "otpCode":"1",
        "transactionId":123,
        "recipient":"+123"
    };
    {
        "otpCode":"2",
        "transactionId":124,
        "recipient":"+456"
    };
    {
        "otpCode":"3",
        "transactionId":125,
        "recipient":"+789"
    }
    ```

## How to run

1. Make your own `scenarios` inside `scenarios` folder, please follow this structure

    `scenarios/<SERVICE_NAME>/<SCENARIO_NAME>`

2. `go run main.go -config scenarios/<SERVICE_NAME>/<SCENARIO_NAME>/config.json`

3. RPS is counted by `request_count / duration`